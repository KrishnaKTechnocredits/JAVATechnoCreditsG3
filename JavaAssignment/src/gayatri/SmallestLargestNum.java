//Q4.largest and smallest num in unsorted array
package gayatri;


	public class SmallestLargestNum {
		void num()
		{
			int[] arr={2,6,3,9,11};
			int min=arr[0];
			int max=arr[0];
			for(int index=0;index<arr.length;index++)
			{
				if(arr[index]<min)
				{
					min=arr[index];
					
				}
				if(arr[index]>max)
				{
					max=arr[index];
				}
				
			}	
				System.out.println("min value is "+min);
				System.out.println("max value is "+max);
		}

		public static void main(String[] args) {
			
			SmallestLargestNum s =new SmallestLargestNum();
			s.num();
		}
	}
