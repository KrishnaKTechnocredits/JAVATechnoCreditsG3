package amrutaC;

public class Assignment_Q3 {
	static int Square,Cube;
	
	static void display(int num)
	{
		Square=num*num;
		Cube=num*num*num;
		System.out.println("Square is "+Square);
		System.out.println("Cube is "+Cube);
	}

	public static void main(String args[])
		{
			int x=Integer.parseInt(args[0]);
			Assignment_Q3.display(x);
		}

}
