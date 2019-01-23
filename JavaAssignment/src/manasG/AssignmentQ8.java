
public class AssignmentQ8 {

	static int varx, vary;

	static void Swap() {
		varx = varx + vary;
		vary = varx - vary;
		varx = varx - vary;
	}

	public static void main(String[] a) {
		varx = Integer.parseInt(a[0]);
		vary = Integer.parseInt(a[1]);
		System.out.println("Value of varx before swap : " + varx + "\nValue of vary before swap : " + vary);
		Swap();
		System.out.println("Value of varx after swap : " + varx + "\nValue of vary after swap : " + vary);

	}

}
