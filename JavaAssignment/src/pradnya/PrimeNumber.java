package pradnya;

public class PrimeNumber {
	static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = Integer.parseInt(args[0]);
		for(int i =2;i<end;i++)
		{
			boolean flag=checkPrimeNumber(i);
			if(flag==true)
			{
				sumPrime(i);
				System.out.println(i + " is prime number");	
			}
		}
		System.out.println(" Total Sum of Prime number :" + sum );
	}
	static void sumPrime(int i)
	{
		sum = sum +i;
	}
	static boolean checkPrimeNumber(int num)
	{
		boolean flag = true;
		for(int i = 2; i<=num/2; i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

}
