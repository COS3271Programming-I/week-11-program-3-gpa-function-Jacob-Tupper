package gpa_function_app;

import java.util.Scanner;
import java.io.PrintStream;

public class GPA_Function_APP {
	static Scanner usin = new Scanner(System.in);
	
	static double computeGPA(double [] grades, double [] credits, int amount_cgpa) {
		//Created variables
		PrintStream so = System.out;
		
		double numer = 0, denom = 0;
		
		//A loop to calculate the numerator and denominator for the GPA
		for (int i = 0; i < amount_cgpa; i++) {
			numer = grades[i] * credits[i] + numer;
			denom = credits[i] + denom;
		}
		return numer/denom;
	}
	
	static double[] collect_grades(int amount_g) {
		//Created variables
		PrintStream so = System.out;
		
		double[] grade_c = new double[amount_g];
		
		//Created a loop to populate the grade vector
		for (int i = 0; i < amount_g; i++) {
			so.printf("Enter Class %d Grade (4-0): ", i+1);
			grade_c[i] = usin.nextDouble();
		}
		return grade_c;
	}
	
	static double[] collect_credits(int amount_c) {
		//Created variables
		PrintStream so = System.out;
		
		double[] credit_c = new double[amount_c];
		
		//Created a loop to populate the credit vector
		for (int i = 0; i < amount_c; i++) {
			so.printf("Enter Class %d Credit: ", i+1);
			credit_c[i] = usin.nextDouble();
		}
		return credit_c;
	}
	
	public static void main(String[] args) {
		//Created variables and vectors
		PrintStream so = System.out;
		
		int amount_m = 0;
		double GPA = 0;
		
		so.print("Enter the total classes that was take: ");
		amount_m = usin.nextInt();
		
		double[] grades_m = new double[amount_m], credits_m = new double[amount_m];
		
		//Collecting the vectors
		grades_m = collect_grades(amount_m);
		credits_m = collect_credits(amount_m);
		
		//Sending the vectors to the calculate the GPA
		GPA = computeGPA(grades_m, credits_m, amount_m);
		
		//Printing out the Grade and GPA
		if (4.00==GPA) {so.printf("A, %.2f", GPA);}
		else if (4.00>GPA && GPA>=3.67) {so.printf("A-, %.2f", GPA);}
		else if (3.67>GPA && GPA>=3.33) {so.printf("B+, %.2f", GPA);}
		else if (3.33>GPA && GPA>=3.00) {so.printf("B, %.2f", GPA);}
		else if (3.00>GPA && GPA>=2.67) {so.printf("B-, %.2f", GPA);}
		else if (2.67>GPA && GPA>=2.33) {so.printf("C+, %.2f", GPA);}
		else if (2.33>GPA && GPA>=2.00) {so.printf("C, %.2f", GPA);}
		else if (2.00>GPA && GPA>=1.67) {so.printf("C-, %.2f", GPA);}
		else if (1.67>GPA && GPA>=1.33) {so.printf("D+, %.2f", GPA);}
		else if (1.33>GPA && GPA>=1.00) {so.printf("D, %.2f", GPA);}
		else if (1.00>GPA && GPA>=0.67) {so.printf("D-, %.2f", GPA);}
		else {so.printf("F, %.2f", GPA);}
	}
	
}
