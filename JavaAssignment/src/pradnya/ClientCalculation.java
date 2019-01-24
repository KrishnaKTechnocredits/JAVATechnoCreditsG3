package pradnya;

public class ClientCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c1 = new Calculation();
		int a= Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//int c = Integer.parseInt(args[2]);
		
		System.out.println("Addition of number : " + c1.add(a,b));
		System.out.println("Division of number : " + c1.div(a, b));
		System.out.println("Multiplication of number :" + c1.mul(a, b));
		System.out.println("Division of number : " + c1.div(a, b));
		System.out.println("Reminder of number : " + c1.rem(a, b));
		
	}

}
