package ankitaS;

public class Assignment1_Q7 {
	void TimeConversion(int Seconds) { // method to convert seconds into
										// hour:minute:second

		int hours = Seconds / 3600;
		int p = Seconds % 3600;
		int minutes = p / 60;
		int seconds = p % 60;

		System.out.println("Time is : " + hours + ":" + minutes + ":" + seconds);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_Q7 a = new Assignment1_Q7();
		int Seconds = Integer.parseInt(args[0]);
		a.TimeConversion(Seconds);
	}

}
