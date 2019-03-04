//Q9.Find all differ index from arrays
package gayatri;

public class AllDifferIndex {
	void differ()
	{
		int[]arr1={10,2,9,14,3};
		int[]arr2={10,2,18,14,13};
		for(int Index1=0;Index1<arr1.length;Index1++)
		{
			if(arr1[Index1]!=arr2[Index1])
			{
				System.out.println("Values are not matching at index :" +Index1);
			}
		}
	}
	public static void main(String[] args)
	{
		AllDifferIndex a =new AllDifferIndex();
		a.differ();
	}

}
