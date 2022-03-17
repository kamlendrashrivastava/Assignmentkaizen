package com.kaizen.io;
import java.util.Scanner;
public class Simpleintrest {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//take input from users
		System.out.print("enter the principal:");
		double principal=input.nextDouble();
		System.out.print("enter the rate");
		double rate=input.nextDouble();
		System.out.print("enter the time");
		int time=input.nextInt();
		System.out.print("enter the amount:");
		double amount= input.nextDouble();
		double interest=(principal * time * rate)/100;
	     amount=(interest+principal);
	    System.out.println("amount:" +amount);
		System.out.println("principal: " + principal);
		System.out.println("Interest Rate: " +rate);
		System.out.println(" Time Duratioin:" +time);
		System.out.println("simple interest:" +interest);
		
	}

}
