package com.bridgelabz;

import java.util.Scanner;

public class ValidationOperations {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the First name : ");
		String firstName = sc.next();
		UserDetailsValidation.isValidFirstName(firstName);
	
		System.out.println("Enter the Last name : ");
		String lastName = sc.next();
		UserDetailsValidation.isValidFirstName(lastName);
	}

}
