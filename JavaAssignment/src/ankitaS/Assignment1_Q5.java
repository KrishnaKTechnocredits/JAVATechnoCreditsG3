package ankitaS;

public class Assignment1_Q5 {

	int CalculateSimpleInterest(int PAmount, int year, int ROI) {  //method to calculate SI

		return (PAmount * year * ROI) / 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PAmount = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int ROI = Integer.parseInt(args[2]);
		Assignment1_Q5 a = new Assignment1_Q5();
		System.out.println(" Final Amount =" + (PAmount + a.CalculateSimpleInterest(PAmount, year, ROI)));

	}

}
