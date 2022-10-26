package edu.wit.cs.comp1000;

import java.util.Scanner;
//new code
// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		int totalInches;
System.out.printf("Enter start Inches: ");
totalInches = input.nextInt();

int Yards;
Yards = totalInches/36;
System.out.printf("Yards:%d%n",Yards);

int Feet;
Feet = totalInches%36/12;
System.out.printf("Feet:%d%n", Feet);

int Inches;
Inches = totalInches%36%12/1;
System.out.printf("Inches:%d%n",Inches);

Yards = input.nextInt();
Feet = input.nextInt();
Inches = input.nextInt();
	}

}
