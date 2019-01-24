package pradnya;

public class TimeConversion {

	static void time(int Seconds)
	{
		
		int Hours = Seconds/3600;
		int Minutes = Seconds%3600/60;
		Seconds = (Seconds%3600)%60;
		
		System.out.println("Time is :"+ Hours + ":" + Minutes + ":" + Seconds);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Seconds = Integer.parseInt(args[0]);
		 time(Seconds);
	}

}
