package amrutaC;

public class Assignment_Q10 {
	public static void main(String[] a)
	{	int sum=0;
		int start = Integer.parseInt(a[0]);
		int end = Integer.parseInt(a[1]);
		for(int i=start;i<=end;i++)
		{
			boolean  f =Prime(i);
			if(f== true)
			{
				System.out.println(i + "is prime ");
				sum=sum+i;
			}	
		}		
			System.out.println("sum of all prime numbers "+ sum);	
		
		
	}
	
	static boolean Prime(int number)
	{
		boolean flag =true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				flag = false;
				break;
			}						
		}
		return flag;
	}

}
