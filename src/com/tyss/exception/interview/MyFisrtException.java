package com.tyss.exception.interview;
import java.util.Scanner;

public class MyFisrtException{
    Scanner sc = new Scanner(System.in);
	
	void exceptionMethod() throws ArithmeticException {
		System.out.println("Enter any number");
		int a = sc.nextInt();
		int y = 100 / a;
		System.out.println(y);
	}

	void exceptionCallerMethod()throws ArithmeticException {		
		try {
			exceptionMethod();
		} catch (ArithmeticException e){
			System.out.println("Cant be divided by zero");
		}
		System.out.println("End of caller method");		
	}
		
	public static void main(String[] args)
	{
		MyFisrtException ex = new MyFisrtException();
		System.out.println("Start of the program");
		ex.exceptionCallerMethod();
		System.out.println("End of the program");
	}	
}


