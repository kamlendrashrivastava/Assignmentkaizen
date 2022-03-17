package com.kaizen.controlstatement;

public class Foreach {
	public static void main(String[] args) {
		int [] array = { 1,2,3,4,5,6,7,8,9,10 };
		// iterating through an array using the for-each loop
		for( int item : array) {
			System.out.println(item);
		}
	}

}
