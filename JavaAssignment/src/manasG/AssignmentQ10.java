
public class AssignmentQ10 {

	static int sum = 0;
	static int i = 13;

	static void primeCheck(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				System.out.println("Number is not prime: " + num);
				break;
			}
		}
		if (flag == false) {
			System.out.println("Number is prime: " + num);
			sum = sum + num;
		}
		System.out.println("sum of prime numbers is = " + sum);
	}

	public static void main(String args[]) {
		for (int i = 2; i <= 100; i++) {
			primeCheck(i);
		}
	}

}
