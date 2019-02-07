
public class AssignmentQ9 {
	static int s, m, h = 0;

	static void time() {
		if (s >= 60) {
			m = s / 60;
		}
		if (m >= 60) {
			h = m / 60;
		}
		System.out.println(h + "hours" + m + "minutes" + s + "seconds");
	}

	public static void main(String[] ar) {
		s = Integer.parseInt(ar[0]);
		time();

	}

}
