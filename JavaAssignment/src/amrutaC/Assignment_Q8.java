package amrutaC;

public class Assignment_Q8 {

	static void Swap(int a, int b)
	{ 
	    int c;
		System.out.println("Initial value of a "+a);
		System.out.println("Initial value of b "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped value of a "+a);
		System.out.println("Swapped value of b "+b);

	}
	public static void main(String args[])
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			Assignment_Q8.Swap(x,y);
		}
}
