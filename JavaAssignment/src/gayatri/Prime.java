//Q10 prime num

package gayatri;

public class Prime {
	void Primecheck(int range) {
		int i;
		int sum = 0;
		boolean flag = true;
		for (i = 2; i <= range; i++) {

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;

				} else {
					flag = true;
				}

			}
			if (flag == true)
				System.out.println(i);

			sum = sum + i;

		}

		System.out.println("Sum of the prime numbers in the range " + range + "is :" + sum);

	}

	public static void main(String arg[]) {
		Prime P = new Prime();
		P.Primecheck(Integer.parseInt(arg[0]));

	}

}
