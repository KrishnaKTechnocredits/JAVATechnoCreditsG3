package assignment4;

import java.util.Scanner;

public class Assignment4_Q11 {

	static void reverse(int num)
	{
		int rev =0;
		int temp =0;
		temp = num;
		while(num>0)
		{
			int mod = num%10;
			num = num/10;
			rev = rev*10+mod;
		}
		System.out.println(rev);
		if(temp == rev)
		{
			System.out.println("Number is palindrome");
		}
		else 
		{
			System.out.println("number is not palindrom");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to check palindrome or not");
		int num =sc.nextInt();
		
		reverse(num);
		//System.out.println("Reverse number is " + " " +rev);

	}

}
