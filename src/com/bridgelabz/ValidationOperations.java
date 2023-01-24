package com.bridgelabz;

import java.util.Scanner;

public class ValidationOperations {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the First name : ");
		String firstName = sc.next();
		UserDetailsValidation.isValidFirstName(firstName);
		System.out.println("********************************************\n");
	
		System.out.println("Enter the Last name : ");
		String lastName = sc.next();
		UserDetailsValidation.isValidLastName(lastName);
		System.out.println("********************************************\n");
		
		UserDetailsValidation.isValidEmail("abAbc12@gfdF.com");
		UserDetailsValidation.isValidEmail("abAbc12.aff23AdS2@gfdF.com.IN");
		UserDetailsValidation.isValidEmail("abc..ch@gmail.com.co");
		System.out.println("********************************************\n");

		UserDetailsValidation.isValidMobileNumber("+91 7982468891");
		UserDetailsValidation.isValidMobileNumber("91 7982468891");
		UserDetailsValidation.isValidMobileNumber("7982468891");
		UserDetailsValidation.isValidMobileNumber("7982468891");
		System.out.println("********************************************\n");		
	}
}