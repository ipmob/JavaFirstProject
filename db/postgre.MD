## querries as per Assignment 


* Write a query which displays the module code and the duration for modules whose duration is less than 6.

>>	SELECT modulecode, duration FROM modules WHERE duration < 6;


* Write a query which will display the BATCHCODE, TRAINERID, COURSECODE, STARTDATE, CAPACITY 
and BATCHSTRENGTH of the batches handled by the trainer KRISHNAN.

>>	SELECT BATCHCODE, TRAINERID, COURSECODE, STARTDATE, CAPACITY,BATCHSTRENGTH FROM batches WHERE trainerid = (SELECT trainerid from trainers where trainername='KRISHNAN');

* Write a query which displays all the module names of the course code 100.

>>	SELECT modulename FROM modules WHERE modulecode in (SELECT modulecode FROM courseandmodules WHERE coursecode = 100);


* Write a query which displays the module names and course code for the course code 100.
>> SELECT modulename, coursecode FROM courseandmodules INNER JOIN modules ON modules.modulecode = courseandmodules.modulecode where coursecode = 100;

* Write a query which will display the number of modules present in the course code 100.
>>	SELECT count(*) as "NumberofModules" from modules INNER JOIN courseandmodules on modules.modulecode = courseandmodules.modulecode where coursecode = 100;


* Write a query which will display all the course code and the number of modules present 
in that particular course.

>>	SELECT coursecode, count(*) as "NumberofModules" from courseandmodules group by coursecode;


* Write a query which will display the course title and fees which has the maximum fees.
>>	SELECT title, fees from courses where fees = (SELECT max(fees) from courses);


* Write a query which will display the student id, student name, batch code, place and phone number of the students who belongs to Batch '3001';

>>	SELECT studentid, studentname, batchcode, place, phone from students where batchcode = 3001;


* Write a Query which will display the student ID, Student name, Batch code, place and phone number who are from CHENNAI.
>>	SELECT studentid, studentname, batchcode, place, phone from students where place = 'CHENNAI';


* Write a query which displays the total number of modules which has less than 6 days duration. 
>>	SELECT count(*) as "LESSTHANSIXDAYS" from modules where duration < 6;


* Write a query to display the batch code, course title, start date of the batches for the month of May and year 2012.

>>	SELECT batchcode, title, startdate from batches INNER JOIN courses on courses.coursecode = batches.coursecode where (date_part('year', startdate)=2012 and date_part('month', startdate)=5);


* Write a query to display courses code, course title, course fees of the courses for which no batches/training has been planned in the month of January and year 2012.

>> SELECT batchcode, title, fees from batches INNER JOIN courses on courses.coursecode = batches.coursecode where (date_part('year', startdate)=2012 and date_part('month', startdate)=1);


* Write a query which displays the names of all the modules of the course titled 'Oracle DBA'

>>	with prev as (
		SELECT coursecode from courses where title  = 'Oracle DBA'
	)
	SELECT modulename, coursecode from modules INNER JOIN courseandmodules on courseandmodules.modulecode = modules.modulecode where coursecode = (SELECT coursecode from prev);


* Write a Query which displays the student ID, Student name, Batch code, place and phone number 
of the student's who took training from CHENNAI in the year 2012.

>>	SELECT studentid, studentname, students.batchcode, place, phone from students INNER JOIN batches on batches.batchcode = students.batchcode where place = 'CHENNAI' and date_part('year', startdate) = 2012;	


* Write a query which will display the student id, student names who are enrolled for the course code 200?
>>	SELECT studentid, studentname, students.batchcode, place, phone from students INNER JOIN batches on batches.batchcode = students.batchcode where place = 'CHENNAI' and date_part('year', startdate) = 2012;
