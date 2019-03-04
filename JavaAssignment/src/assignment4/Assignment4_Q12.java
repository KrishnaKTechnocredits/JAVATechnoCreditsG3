package assignment4;

import java.util.Scanner;

/*
 * WAP to find word is palindrome or not ? 
 * a. String name = “naman” i. Naman is palindrome 
 * b. String name = “harsh” i. Harsh is not palindrome 
 */
public class Assignment4_Q12 {

	String reverse(String str)
	{
		int index =0;
		String rev ="";
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println(rev +" " + "is palindrome");
		}
		else 
		{
			System.out.println(rev + " " + "is not palindrome");
		}
		return rev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String str= sc.next();
		Assignment4_Q12 as = new Assignment4_Q12();
		String rev = as.reverse(str);
		//System.out.println("Reverse of String is " +rev);
	}

}
