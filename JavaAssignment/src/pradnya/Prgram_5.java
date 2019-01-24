package pradnya;

public class Prgram_5 {
	
	static float simpleInterest(float P, float T, float R)
	{
		float interest= (P*T*R)/100;
		return interest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float P = Float.parseFloat(args[0]);
		float T = Float.parseFloat(args[1]);
		float R = Float.parseFloat(args[2]);
		System.out.println("Simple Interest :" + simpleInterest(P, T, R));

	}

}
