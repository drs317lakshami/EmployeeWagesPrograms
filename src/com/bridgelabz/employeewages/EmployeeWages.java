package com.bridgelabz.employeewages;

import java.util.Random;

public class EmployeeWages {
	/*
	 * Calculating Wages for a Month by assuming 20 working day per month
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Java Program");

		Random random = new Random(); // random object

		// Initialization
		int wagePerHrs = 20;

		int fullDayHrs = 8;

		int halfDayHrs = 4;

		int salary = 0;

		int monthlysalary = 0;

		int workingDaysPerMonth = 20;

		/*
		 * using a loop to provide the days to work
		 * 0,1,2 random number
		 */
		for (int i = 1; i <= workingDaysPerMonth; i++) {
			int randomNum = random.nextInt(3);
			
			switch (randomNum) {

			case 0:
				System.out.println("Employee is Absent");
				System.out.println("Monthly Salary will be: "+salary);
				break;
			case 1:
				System.out.println("Employee is Present");
				salary = wagePerHrs * fullDayHrs;
				System.out.println("Monthly salary for Full Day: " +salary);
			
				break;
			case 2:
				System.out.println("Employee is Present");
				salary = wagePerHrs * halfDayHrs;
				System.out.println("Monthly Salary for Half Day: "+salary);
				
				break;

			}}}}