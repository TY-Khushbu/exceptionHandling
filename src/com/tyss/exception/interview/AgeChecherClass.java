package com.tyss.exception.interview;

import java.util.Scanner;

public class AgeChecherClass {
	int age;

	public void ageInput(int age) throws AgeValidatorException {
		if (age > 17) {
			System.out.println("Welcome To Vote");
		} else {
			throw new AgeValidatorException("Not eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		AgeChecherClass ac=new AgeChecherClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		try {
			ac.ageInput(age);
		} catch (Exception e) {			
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
	}
}
