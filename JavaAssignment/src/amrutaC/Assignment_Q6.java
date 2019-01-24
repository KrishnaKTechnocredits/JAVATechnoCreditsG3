package amrutaC;

public class Assignment_Q6 {
	static void Temperature(double F )
	{   
		double Celsius =(F - 32) * 5 / 9;
		System.out.println("Celsius = (F - 32) * 5 / 9");
		System.out.println("Where,"+ "\n" + "F is the Fahrenheit");
		System.out.println("Celsius = "+Celsius);
		
	}
	public static void main(String args[])
		{
			String str=args[0];
			double x=Double.parseDouble(str);
			Assignment_Q6.Temperature(x);
		}
}
