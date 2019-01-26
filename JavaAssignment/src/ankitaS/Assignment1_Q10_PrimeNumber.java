package ankitaS;

public class Assignment1_Q10_PrimeNumber { //method to check wether number is prime number
	static boolean Primecheck(int a) {

		boolean flag1 = true;

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag1 = false;
				break;
			}
		}

		return flag1;
	}
}
