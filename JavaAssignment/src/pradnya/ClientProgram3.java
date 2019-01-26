package pradnya;

public class ClientProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerProgram3 s = new ServerProgram3();
		int a = Integer.parseInt(args[0]);
		s.square(a);
		s.cube(a);
		System.out.println("Square :" + s.square(a));
		System.out.println("Cube : " + s.cube(a));
		
	}
	

}
