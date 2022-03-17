package com.kaizen.controlstatement;

public class Nestedif {
	public static void main(String args[]) {
		int n= 9;
		{
		 if(n>10)
				System.out.println("n is greater");
			if(n<10)
				System.out.println("n is smaller");
		}
		
	}

}
