package amrutaC;

public class Assignment_Q1 {
	static int r;	
	static void sum (int a,int b)
{
	r=a+b;
	System.out.println("Sum is "+r);
	
}
static void mul (int a,int b)
{
	r=a*b;
	System.out.println("Multiplication is "+r);
	
}
static void sub (int a,int b)
{
	r=a-b;
	System.out.println("Subtraction is "+r);
	
}
static void div (int a,int b)
{
	r=a/b;
	System.out.println("Division is "+r);
	
}
static void remainder(int a,int b)
{
	r=a%b;
	System.out.println("Remainder is "+r);
	
}

public static void main(String args[])
{
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	Assignment_Q1.sum(x,y);
	Assignment_Q1.mul(x,y);
	Assignment_Q1.sub(x,y);
	Assignment_Q1.div(x,y);
	Assignment_Q1.remainder(x,y);
}

}
