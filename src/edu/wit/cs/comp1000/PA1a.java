package edu.wit.cs.comp1000;

import java.util.Scanner;
//new code
// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
Scanner input= new Scanner(System.in);
		
		int Yards;
		System.out.printf("enter Yards: ");
		Yards=  input.nextInt();
		int feet;
		System.out.printf("Enter Feet: ");
		feet = input.nextInt();
		int Inches;
		System.out.printf("Enter Inches: ");
		Inches = input.nextInt();
		
		int Total;
		
		Total = (Yards*36 + feet*12 + Inches*1);
		System.out.printf("The sum is %d%n", +Total);
		
	}

}
