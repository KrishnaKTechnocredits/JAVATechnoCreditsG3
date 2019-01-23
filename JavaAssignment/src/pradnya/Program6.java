package pradnya;

public class Program6 {
	
	static void temperature(float Fahrenheit)
	{
		float celsius=(Fahrenheit-32)*5/9f;
		
		System.out.println("Temperature in celsius degree is  :"+ celsius +"C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=Float.parseFloat(args[0]);
		temperature(a);
	}

}
