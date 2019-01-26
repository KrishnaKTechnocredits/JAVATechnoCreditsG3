package pradnya;

public class SwapProgram1 {

	static void swap1(int a, int b)
	
	{
		a = a+b;
		b =a-b;
		a =a-b;
		System.out.println("After Swap :"  + a + " " + b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	
		System.out.println("Please pass no : " + args[0] + " " + args[1]);
		
		swap1(a,b);
	}

}
