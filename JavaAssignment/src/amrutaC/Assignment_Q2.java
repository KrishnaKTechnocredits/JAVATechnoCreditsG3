package amrutaC;

public class Assignment_Q2 {
	static void display(String name, int rNo ,int marks)
	{
		System.out.println ("Details of the student:-");
		System.out.println("Name: "+name+ "\n" +"roll no.: "+rNo+ "\n" +"Marks: " +marks);
	}

	public static void main(String args[])
		{
			String name= args[0];
			int x=Integer.parseInt(args[1]);
			int y=Integer.parseInt(args[2]);
			Assignment_Q2.display(name,x,y);
		}

}
