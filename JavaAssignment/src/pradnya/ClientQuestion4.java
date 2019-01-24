package pradnya;

public class ClientQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerQuestion4 s= new ServerQuestion4();
		int l = Integer.parseInt(args[0]);
		int w = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		//s.areaRectangle(l,w);
		
		//s.areaCircle(r);
		//s.perimeterOfCircle(r);
		System.out.println("Area of Rectangle =" +s.areaRectangle(l,w) );
		System.out.println("Perimeter of Rectangle =" + s.perimeterOfRectangle(l,w));
		System.out.println("Area of Circle =" + s.areaCircle(r));
		System.out.println("Perimeter of Circle =" + s.perimeterOfCircle(r));
		
	}

}
