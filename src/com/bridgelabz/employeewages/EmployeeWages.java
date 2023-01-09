package com.bridgelabz.employeewages;

import java.util.Random;

public class EmployeeWages {
	/*
	 * Add Part time Employee & Wage by assuming part time hours is 8
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Java Program");

		Random random = new Random(); // using random for storing values.

		int WAGE_PER_HOUR = 20

		int Full_Day_Hrs = 8;

		int Half_Day_Hrs = 4;

		int salary = 0; // will give 0,1,2 random number

		int randomNum = random.nextInt(3); 

		if (randomNum == 1) {
			System.out.println("Employee is Present");
			salary = WAGE_PER_HOUR * Full_Day_Hrs;
		} else if (randomNum == 2) {
			salary = WAGE_PER_HOUR * Full_Day_Hrs;
			System.out.println("Employee is Present for half day");

		} else
			System.out.println("Employee is Absent");
		System.out.println("Salary is: " + salary);
	}

}

