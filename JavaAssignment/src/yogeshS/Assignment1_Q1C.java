package yogeshS;
import java.util.*;
public class Assignment1_Q1C {
	
	public static void main(String args []){

		//Scanner object declaration//
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a=in.nextInt();
		
		System.out.println("Enter Second Number");
		int b=in.nextInt();
		
		//Class object declaration//
		
		Assignment1_Q1 S1=new Assignment1_Q1 ();

		int res1=S1.sum(a,b);
		System.out.println("Sum is"+res1);
		int res2=S1.multiplication(a,b);
		System.out.println("Multiplication is"+res2);
		int res3=S1.division(a,b);
		System.out.println("division reminder is"+res3);
		int res4=S1.minus(a,b);


		System.out.println("Subtraction is"+res4);

		int total=res1+res2+res3+res4;
		System.out.println("Final Total Is ="+total);
		

		}


}
