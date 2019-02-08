package assignment3;

import java.util.Scanner;
/*
 3.	Write a Java program that takes a year from user and print whether that year is a leap year or not 
 */
public class Program3 {
	static void leapYear(int year)
	{
		if(year%4==0)
		{
			System.out.println("Year is leap:");
		}
		else{
			System.out.println("Year is not leap");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leapYear(2016);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter year ");
		int year = sc.nextInt();
		leapYear(year);
		
	}

}
