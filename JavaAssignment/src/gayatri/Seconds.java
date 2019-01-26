//Q7 Convert seconds to hrs,min and sec

package gayatri;

public class Seconds {
	void TimeConversion(int seconds) {

		int Hr = seconds / 3600;
		int Minutes = (seconds % 3600) / 60;
		int secop = (seconds % 3600) % 60;

		System.out.println("TimeConversion is " + Hr + ":" + Minutes + ":" + secop);
	}

	public static void main(String args[]) {
		Seconds S = new Seconds();
		S.TimeConversion(500);
	}

}
