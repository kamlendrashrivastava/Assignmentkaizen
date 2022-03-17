package com.kaizen.io;
import java.util.Scanner;

public class Starrightangletraingle {
	public static void main(String[] args) {
		int i,j,n;
		System.out.println("Input no. of rows :");
		Scanner in= new Scanner(System.in);
		n= in.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			    System.out.print(" * ");
			    System.out.println("");
		}
		
		
	}

}
