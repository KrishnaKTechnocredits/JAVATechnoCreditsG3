package gayatri;

public class SquareCube {
	void Maths(int num) {
		int Square = num * num;
		int Cube = num * num * num;
		System.out.println("Square of num is " + Square);
		System.out.println("Cube of num is " + Cube);

	}

	public static void main(String args[]) {
		SquareCube S = new SquareCube();
		S.Maths(5);
	}
}
