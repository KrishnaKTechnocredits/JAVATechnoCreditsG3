package ankitaS;

public class Assignment1_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(args[0]);

		int sum = 0;

		Assignment1_Q10_PrimeNumber n = new Assignment1_Q10_PrimeNumber();
		for (int i = 2; i <= num; i++) {
			boolean flag = n.Primecheck(i);
			if (flag == true) {
				sum = sum + i;

			}

		}

		System.out.println("sum is = " + sum);
	}
}
