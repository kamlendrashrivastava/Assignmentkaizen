package com.kaizen.io;

import java.util.Scanner;

public class io {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter name:");
		String name=in.next();
		System.out.println("your name is " +name);
		System.out.println("enter your age?");
		int age = in.nextInt();
		System.out.println("your age is " +age);
	}
	
	

}
