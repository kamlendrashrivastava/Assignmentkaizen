package com.kaizen.io;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while(true) {
		System.out.println(" enter month");
		int month= in.nextInt();
		switch(month) {
		case 1:
			System.out.println("jan");
		case 2:
			System.out.println("feb");
		case 3:
			System.out.println("march");
		case 4:
			System.out.println("april");
		case 5:
			System.out.println("may");
		case 6:
			System.out.println("june");
		case 7:
			System.out.println("july");
		case 8:
			System.out.println("Aug");
		case 9:
			System.out.println("Sep");
		case 10:
			break;
		}
		
		
	}
	

}


}
