package com.bridgelabz.employeewages;

import java.util.Random;

public class EmployeeWages {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Java Program");

		Random random = new Random();
		int randomNumer = random.nextInt(2);

		if (randomNumer == 1)
			System.out.println("Employee is Present");
		else
		  System.out.println("Employee is Absent");
	}

}
