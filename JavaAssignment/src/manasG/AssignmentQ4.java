
public class AssignmentQ4 {
	static int num;

	static void SCnum() {
		int square = num * num;
		int cube = num * num * num;
		System.out.println("Square of the number = " + square);
		System.out.println("Cube of a number = " + cube);

	}

	public static void main(String[] args) {
		num = Integer.parseInt(args[0]);
		SCnum();
	}

}
