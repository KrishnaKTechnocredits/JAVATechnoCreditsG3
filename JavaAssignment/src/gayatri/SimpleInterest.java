//Q5 Calculate SimpleInterest

package gayatri;

public class SimpleInterest {

	void CalInterest(float P, float T, float R) {
		float Interest = 0;
		Interest = (P * T * R) / 100;
		System.out.println("Simple Interest is : " + Interest);
	}

	public static void main(String arg[]) {
		SimpleInterest S = new SimpleInterest();
		S.CalInterest(Float.parseFloat(arg[0]), Float.parseFloat(arg[1]), Float.parseFloat(arg[2]));
		// S.CalInterest(2300,4,6);
	}
}
