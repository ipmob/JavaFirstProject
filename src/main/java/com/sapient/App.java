package com.sapient;


public class App 
{
    public static void main( String[] args )
    {
		Command_Line1 cli1 = new Command_Line1();
		cli1.setData(args);
		cli1.calData();

		cli1.displayData();
    }
}

