package assignment4;

public class Assignment4_Q1 {
	
	void positive(int[] array)
	{
		int sum =0;
		//int[] num = new int[array];
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]>0)
			{
				System.out.println("Number is positive : " + array[i]);
				sum = sum + array[i];
			}
		}
		System.out.println("Sum of Positive number is :" + sum);
	}
		void negative(int[] array)
		{
			int sum=0;
		for(int i=0;i<=array.length-1;i++)
			
		{
			if(array[i]<0)
			{
				System.out.println("Number is negative " + array[i]);
				sum =sum + array[i];
			}
			
		}
		System.out.println("Sum of Negative number is : " + sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] ={5,6,9,16,-9,-8,7};
		Assignment4_Q1 as = new Assignment4_Q1();
		as.positive(array);
		as.negative(array);
				
	}

}
