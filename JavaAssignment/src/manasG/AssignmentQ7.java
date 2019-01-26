
public class AssignmentQ7 {

	static int varx, vary, put;

	static void Swap() {
		put = varx;
		varx = vary;
		vary = put;
	}

	public static void main(String[] a) {
		varx = Integer.parseInt(a[0]);
		vary = Integer.parseInt(a[1]);
		put = Integer.parseInt(a[2]);
		System.out.println("Value of varx before swap : " + varx + "\nValue of vary before swap : " + vary);
		Swap();
		System.out.println("Value of varx after swap : " + varx + "\nValue of vary after swap : " + vary);

	}

}
