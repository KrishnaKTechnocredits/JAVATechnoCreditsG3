package amrutaC;

public class Assignment_Q9 {
	static void Swap(int a,int b)
	{ 
		System.out.println("Initial value of a "+a);
		a=b;
		System.out.println("Swapped value of a "+a);
		System.out.println("Initial value of b "+b);
		a=10;
		b=a;
		System.out.println("Swapped value of b "+b);
	}

	public static void main(String args[])
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			Assignment_Q9.Swap(x,y);
		}

}
