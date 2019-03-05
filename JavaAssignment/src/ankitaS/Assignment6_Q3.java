package ankitaS;

import java.io.IOException;

public class Assignment6_Q3 {

	static void f() throws Exception {
		try {
			g();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Catch block of IO exception and throwing new Exception");

			throw new Exception();
		}

	}

	static void g() throws IOException {

		System.out.println("This is g method");
		throw new IOException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Assignment6_Q3.f();

		} catch (Exception e) {
			System.out.println("You are in catch block of main method");
		}

	}

}
