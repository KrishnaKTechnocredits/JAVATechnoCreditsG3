//Program to handle exception when object reference is initialized to null.

package ankitaS;

public class Assignment6_Q1 {

	void method1() // non-static method
	{
		System.out.println("This is non-static method.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6_Q1 Assignment6_Q1 = new Assignment6_Q1();
		Assignment6_Q1 = null; // object reference initialized to null
		try {
			Assignment6_Q1.method1();
		} catch (RuntimeException e) {
			System.out.println("You have initialised object reference to null");
		}

	}

}
