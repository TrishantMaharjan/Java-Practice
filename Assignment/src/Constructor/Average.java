package Constructor;

import java.util.Scanner;

/*
 * Print the average of three numbers entered by user by creating a class named 
 * 'Average' having a method to calculate and print the average.
 */

public class Average {
	
	float num1;
	float num2;
	float num3;
	
	Average(){
		num1 = 0;
		num2 = 0;
		num3 = 0;
	}
	
	Average(float num1, float num2, float num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	void calcAverage(){
		float average = (num1+num2+num3)/3;
		System.out.println("The average is "+average);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		float num1 = sc.nextFloat();
		System.out.println("Enter 2nd number ");
		float num2 = sc.nextFloat();
		System.out.println("Enter 3rd number ");
		float num3 = sc.nextFloat();
		Average avg = new Average(num1, num2, num3);
		avg.calcAverage();
		sc.close();
	}
}
