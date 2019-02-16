package assignment4;
/*
 *  WAP to find Fibonacci series for user defined number
 *   a. Input number :- 5 
 *   b. Output :- 120 
 */
public class Assignment4_Q7 {

	int factorial(int num)
	{
		int output =1;
		for(int i=1;i<=num;i++){
			output =output*i;
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		Assignment4_Q7 as = new Assignment4_Q7();
		int output = as.factorial(num);
		System.out.println(output);
	}

}
