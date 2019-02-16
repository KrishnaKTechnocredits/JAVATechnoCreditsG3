package assignment4;

public class Assignment4_Q5 {
	
	static int reverse(int num)
	{
		int rev =0;
		while(num>0)
		{
			int mod = num%10;
			num = num/10;
			rev = rev*10+mod;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =456789;
		
		int rev =reverse(num);
		System.out.println("Reverse number is " + " " +rev);
	}

}
