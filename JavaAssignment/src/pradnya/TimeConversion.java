package pradnya;

public class TimeConversion {

	static void time(int a)
	{
		 int b = a%60;
		int c=a/60;
		int d=c/60;
		c=c%60;
		
		System.out.println("Time is :"+d + ":" + c + ":" + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		 time(a);
	}

}
