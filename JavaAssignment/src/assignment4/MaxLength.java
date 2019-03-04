package assignment4;
/*
 * WAP to find max length string from the given array.
 */
public class MaxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input ={"all the best", "technocredit", "Maharashtra"};
		MaxLength ml = new MaxLength();
			String result = ml.maxLength(input);
			System.out.println(result);	
	}
	String maxLength(String[] input)
	{
		int max=0;
		String result ="";
		for(int i=0;i<input.length;i++)
		{
			if(input[i].length()>max)
				
			{
				max = input[i].length();
				result=input[i];
			}
				
		}	
		
		return result;
	}
	

}
