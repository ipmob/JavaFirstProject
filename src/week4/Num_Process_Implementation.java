package com.sapient.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num_Process_Implementation {

	public static void main(String[] args) {

		Num_Process add = (a, b) -> a + b;
		Num_Process subtract = (a, b) -> a - b;
		Num_Process multiply = (a, b) -> a * b;
		Num_Process divide = (a, b) -> a / b;

		List<Num_Process> opertions = new ArrayList<Num_Process>(Arrays.asList(add, subtract, multiply, divide));

		System.out.println("Enter the numbers for operation:");
		int num1 = Input.scan.nextInt();
		int num2 = Input.scan.nextInt();

		System.out.println("Enter your choice of operation :");
		int choice = Input.scan.nextInt();
		choice--;
		System.out.println(opertions.get(choice).intCal(num1, num2));
	}
}
