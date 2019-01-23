package amrutaC;

public class Assignment_Q7 {
	static void Time(int input)
	{ 
		int hours =input/3600;
		int minutes=(input%3600)/60;
		int seconds=(input%3600)%60;
		System.out.println("Hours: "+hours+"\n"+"Minutes: "+minutes+"\n"+"Seconds: "+seconds);
	}
	public static void main(String args[])
		{
			String str=args[0];
			int x=Integer.parseInt(str);
			Assignment_Q7.Time(x);
		}

}
