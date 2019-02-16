package assignment4;

public class Assignment4_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "automation engineering";
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i) =='u' || str.charAt(i)=='o' || str.charAt(i)=='e')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
