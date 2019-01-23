package amrutaC;

public class Assignment_Q5 {
	static void Simple_Interest(double P,double T,double R )
	{   
		double Simple_Interest =(P*T*R)/100;
		System.out.println("Simple Interest =(P*T*R)/100");
		System.out.println("Where,"+ "\n" + "P is the principle amount "+ "\n" +"T is the time [year] and " + "\n"+ "R is the rate");
		System.out.println("Simple Interest = "+Simple_Interest);
		
	}
	public static void main(String args[])
		{
			String str=args[0];
			String str1=args[1];
			String str2=args[2];
			double x=Double.parseDouble(str);
			double y=Double.parseDouble(str1);
			double z=Double.parseDouble(str2);
			Assignment_Q5.Simple_Interest(x,y,z);
		}

}
