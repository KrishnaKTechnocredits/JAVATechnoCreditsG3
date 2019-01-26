package amrutaC;

public class Assignment_Q4 {
	static double area;
	static double perimeter;
	
static void Circle(double p,double r)
{   
	area=p*r*r;
	perimeter=2*p*r;
	System.out.println("Area of Circle is "+area);
	System.out.println("Perimeter of Circle is "+perimeter);
	
}
static void Rectangle(double w,double l)
{
	area=w*l;
	perimeter=2*w+2*l;
	System.out.println("Area of Rectangle is "+area);
	System.out.println("Perimeter of Rectangle is "+perimeter);
}

public static void main(String args[])
	{
		String str=args[0];
		String str1=args[1];
		double x=Double.parseDouble(str);
		double y=Double.parseDouble(str1);
		Assignment_Q4.Circle(x,y);
		Assignment_Q4.Rectangle(x,y);
	}

}
