package assignment4;
/* 
 * WAP to find reverse max length string
 * input= { " all the best", "technocredits","maharashtra"}
 * output = 
 */
public class Assignment4_Q6 {

	public static void main(String[] args) {
		String input[] ={"all the best","technocredits","maharashtra"};
		Assignment4_Q6 as = new Assignment4_Q6();
		String output = as.maxLength(input);
		System.out.println(output);
		String revoutput = as.reverse(output);
		System.out.println(revoutput);
	}
	
	public String maxLength(String[] input)
	{
		String output="";
		int index =0;
		for(int i=0;i<input.length;i++)
		{
			if(input[i].length()>output.length())
			{
			index = input[i].length();
			output = input[i];
			}
		}
		return output;
	}
	public String reverse(String output)
	{
		String revoutput ="";
		for(int i=output.length()-1;i>=0;i--)
		{
			revoutput =revoutput + output.charAt(i);
		}
		return revoutput;
	}

}
