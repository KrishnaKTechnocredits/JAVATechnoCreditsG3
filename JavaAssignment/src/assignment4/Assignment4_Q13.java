package assignment4;

import java.util.Scanner;

/*
 * WAP to find number is Armstrong or not.
 *  a. Int number = 153 i. Number is Armstrong 
 *  b. Int number = 234 i. Number is not Armstrong 
 * 
 */
public class Assignment4_Q13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num =153;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		//int num = 234;
		int modular =0;
		int add =0;
		int temp = 0;
		temp =num;
		while(num>0)
		{
			modular=num%10;
			num=num/10;
			add= add+modular*modular*modular;
			
		}
		System.out.println(add);
		if(temp==add)
		{
			System.out.println("Number is Armstrong");
		}
		else 
		{
			System.out.println("Number is not Armstrong");
		}
	}

}
