package assignment4;
/*
 * WAP to sum of two array
 * first array= {1,5,9,3,7}
 * second array ={1,7,9,3}
 */
public class Assignment4_Q10 {

	int sumArray1(int[] array1)
	{
		int sum =0;
		for(int i=0;i<array1.length;i++)
		{
			sum =sum + array1[i];
			
		}
		return sum;
		
	}
	int sumArray2(int[] array2)
	{
		int sum =0;
		for(int i=0;i<array2.length;i++)
		{
			sum =sum + array2[i];
			
		}
		return sum;
	}
	
	int sumOfArray(int sum1, int sum2)
	{
		int sum =0;
		sum = sum1 + sum2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,5,9,3,7};
		int[] array2= {1,7,9,3};
		Assignment4_Q10 as = new Assignment4_Q10();
		int sum1 = as.sumArray1(array1);
		//System.out.println(sum1);
		int sum2 = as.sumArray2(array2);
		//System.out.println(sum2);
		int sum = as.sumOfArray(sum1, sum2);
		System.out.println("Sum of two array is :" + sum);
		}

}
