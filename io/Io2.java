package com.kaizen.io;
import java.util.Scanner;
public class Io2 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.printf("first name:");
		String name=in.next();
		System.out.printf("your first name is " +name);
		
		System.out.printf("Last name:");
		String lastname=in.next();
		System.out.printf("your Last name is " +lastname);
		
		System.out.printf("enter your age?");
		int age = in.nextInt();
		System.out.printf("your age is " +age);
		
		System.out.printf("Address:");
		String address=in.next();
		System.out.printf("your Address is " +address);
	}
	

}
