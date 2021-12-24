package com.linelLenghtComputation;
import java.util.Scanner;
public class LineLenghtComputation {
	public static void main(String[] args) {
		System.out.println("welcome to line lenght computation problem");
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-cordinate of first point: ");
		int x1 = sc.nextInt(); 
		System.out.println("Enter y-cordinate of first point: ");
		int y1 = sc.nextInt();
		System.out.println("Enter x-cordinate of second point: ");
		int x2 = sc.nextInt();
		System.out.println("Enter y-cordinate of second point: ");
		int y2 = sc.nextInt();
		
		
		//Calculation of lenght of line
		double Line_Lenght1 = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
		System.out.println("Lenght of line : "+ Line_Lenght1);
		
		//Co-ordinates for second line
		System.out.println("Enter Co-ordinates for second line");
				
		System.out.println("Enter x-cordinate of first point: ");
		int px1 = sc.nextInt(); 
		System.out.println("Enter y-cordinate of first point: ");
		int py1 = sc.nextInt();
		System.out.println("Enter x-cordinate of second point: ");
		int px2 = sc.nextInt();
		System.out.println("Enter y-cordinate of second point: ");
		int py2 = sc.nextInt();
				
		double Line_Lenght2 = Math.sqrt( (px2 - px1) ^ 2 + (py2- py1) ^ 2);
	    System.out.println("Lenght of line : "+ Line_Lenght2);
	    
	    if( Line_Lenght2== Line_Lenght1  ) {
			System.out.println("\nBoth lines are equal!");
			
		}
		else {
			System.out.println("\nLines are Distinct!");
		}
	 
	}
}
