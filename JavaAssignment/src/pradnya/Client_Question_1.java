package pradnya;

public class Client_Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		Question_1 q =new Question_1();
		q.sum(a,b);
		q.sub(a,b);
		q.mul(a,b);
		q.div(a,b);
		q.rem(a,b);
	
		System.out.println("Sum of numbers : " + q.sum(a,b));
		System.out.println("Subtraction of number :" + q.sub(a,b));
		System.out.println("Multiplication of number : " + q.mul(a,b));
		System.out.println("Division of number " + q.div(a,b));
		System.out.println("Reminder of number " + q.rem(a,b));
	}
}
