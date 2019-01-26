package radhikaM;

public class RadhikaCube

{
	int n = 0;

	public int cube(int n) {
		int answer = n * n * n;
		return answer;
	}

	public static void main(String args[]) {

		RadhikaCube c = new RadhikaCube();
		c.cube(Integer.parseInt(args[0]));
		System.out.println(c.cube(Integer.parseInt(args[0])));

	}

}
