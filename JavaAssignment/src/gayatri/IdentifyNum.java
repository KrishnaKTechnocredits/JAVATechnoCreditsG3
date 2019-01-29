//Q3.Check if array contains a num
package gayatri;

public class IdentifyNum {
	void number()
	{
		int[]arr={2,5,9,7,8,4,6,9};
		int num=8;
		int index;
		boolean found=false;
		for(index=0;index<arr.length;index++)
		{
			if(arr[index]!=num)
				
				found=false;
			else
			{
				found =true;
				//break;
			}
		}
		if(found == true)
			System.out.println("number found at index" +index);
		else
			System.out.println("number is not in array");
	}

	 	public static void main(String[] args) {
		
		IdentifyNum q = new IdentifyNum();
		q.number();
	}

}
