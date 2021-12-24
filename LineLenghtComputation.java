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
		sc.close();
		
		
		//Calculation of lenght of line
		double Line_Lenght = Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
		System.out.println("Lenght of line : "+ Line_Lenght);
	}
}
