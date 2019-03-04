package assignment4;
/*
 * find sum of user given number
 * input -159753
 * output -30
 */
public class Assignmen4_Q4 {

	 static int sum(int input)
	{
		int sum =0;
		while(input>0)
		{
			sum  = sum+input%10;
			input =input/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =159753;
		int sum =sum(input);
		System.out.println(sum);
		
		
	}

}
