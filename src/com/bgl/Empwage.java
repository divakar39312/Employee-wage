package com.bgl;

public class Empwage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Program");
		System.out.println("********************************\n");
		
		int wagePerHour = 20;
		int numberOfHours = 8;
		int partTimeHours = 4;
		int isPresent = (int) Math.floor(Math.random() * 10) % 3;
		switch (isPresent) {
		case 1 :
			System.out.println("Employee is Present : P");
			System.out.println("Employee earn = " + numberOfHours * wagePerHour);
			break;
		case 2 :
			System.out.println("Employee is Part Time Present : (1/2) P");
			System.out.println("Employee earn with PartTime = " +partTimeHours * wagePerHour);
			break;
		case 0 :
			System.out.println("Employee is Absent  : A");
			System.out.println("Employee earn = 0");
			break;
		}
	}
}
