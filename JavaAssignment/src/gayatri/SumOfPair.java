//Q7.finad all pairs of arrays which is equal to given number
package gayatri;

public class SumOfPair {
	
	void pair()
	{
		int[] arr={2,4,3,5,7,8,9};
		int sum=7;
		
			for(int index1=0;index1<arr.length;index1++)//comparing two arrays
			for(int index2=index1+1;index2<arr.length;index2++)
			{
				if (arr[index1]+arr[index2]==sum)
				{
					System.out.println("Sum of pair is " +arr[index1]  +","  + arr[index2]);
				}
			}
				
	}

	public static void main(String[] args) 
	{
			SumOfPair s =new SumOfPair();
			s.pair();
	}
}
