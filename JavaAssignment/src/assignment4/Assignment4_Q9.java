package assignment4;
/*
 * WAP to find average sum of given array
 * Array {14,32,19,14,78,36}
 */
public class Assignment4_Q9 {
	static void average()
	{
	float sum= 0;
	float[] array = {14,32,19,14,78,36};
	for(int i=0;i<=array.length-1;i++)
	{
		sum = sum + array[i];
		
	}
	sum = sum/array.length;
	System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		average();
	}

}
