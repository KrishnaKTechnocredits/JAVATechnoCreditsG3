//Q6 convert temp from fahrenheit to Celsius

package gayatri;

public class Celsius {
	void TempConverion(float Fahre) {
		float celsius = 0;

		celsius = (Fahre - 32) * 5 / 9;
		System.out.println("Temprature in celsius :" + celsius);
	}

	public static void main(String args[]) {
		Celsius C = new Celsius();
		C.TempConverion(Float.parseFloat(args[0]));
	}

}
