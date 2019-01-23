package ankitaS;

public class Assignment1_Q6 {

	double FarenheitToCelsius(double temp) { // method to convert temperature
												// into celsius

		return (temp - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_Q6 a = new Assignment1_Q6();
		double temp = Double.parseDouble(args[0]);
		System.out.println("Temperature in Celsius is : " + a.FarenheitToCelsius(temp));
	}

}