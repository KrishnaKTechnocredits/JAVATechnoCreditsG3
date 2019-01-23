
public class AssignmentQ5 {
	static int p, r, t;

	static void SI() {
		int SimpleInterest = (p * t * r) / 100;
		System.out.println("Simple intrest for this month is : " + SimpleInterest);
	}

	public static void main(String[] args) {
		p = Integer.parseInt(args[0]);
		r = Integer.parseInt(args[1]);
		t = Integer.parseInt(args[2]);
		SI();
	}
}
