## querries as per Assignment 



* Display all the documents in the collectiion.
db.employee.find()

* Display the fields _id, fname  for all the documents in the collection.
db.employee.find({}, {fname:1})

* Displaythe all fields   but exclude the field id for all the documents in the collection.
db.employee.find({}, {_id:0})

* Display the first 5 Employees  
db.employee.find().limit(5)

* Display the next 5 Employees after skipping first 5
db.employee.find().skip(5).limit(5)

* Display the Employee who stay in Gurgaon city 
db.employee.find({city:"Gurgaon"})

* Display the Employee who january salary is less than 20000
db.employee.find({"salary.0":{$lt: 20000}})

* Display the Employese whose january salary is less than 20000 and who stay in Gurgaon city.
 db.employee.find({"salary.0":{$lt: 20000}, city: "Gurgaon"})

* Display the total salary of january month for all the employee.
db.employee.aggregate({$group: {_id: null, total: {$sum: {$arrayElemAt : ["$salary", 0]}}} })

* Count how any employee stay in Gurgaon city.
db.employee.find({city:"Gurgaon"}).count()
