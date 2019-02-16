package assignment4;
/*
 * WAP to find frequency of user defined character in user defined String
 *  a. i.e. User String :- “electrical engineering” 
 *  b. char value :- e 
 *  c. count of e :- 5 
 */	
public class Assignment4_Q3 {
	
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "electrical engineering";
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println("count of e is " + count);
		
	}

}
