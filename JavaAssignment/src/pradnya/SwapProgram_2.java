package pradnya;

public class SwapProgram_2 {
	
	static void swap(int a, int b)
	{
		int temp =a;
		a=b;
		b= temp;
		System.out.println(" After Swap :" + a + " "+ b) ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Before swap :" + args[0] + " " + args[1]);
		swap(a, b);
	}

}
