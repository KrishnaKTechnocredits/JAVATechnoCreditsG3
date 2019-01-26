package pradnya;

public class ClientStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerStudent s= new ServerStudent();
		int Roll_no = Integer.parseInt(args[0]);
		String name = args[1];
		int a = Integer.parseInt(args[2]);
		System.out.println("Roll no. is :" + s.rollno(Roll_no));
		System.out.println("Student name is : " + s.studentName(name));
		System.out.println("Student Mark is "+ s.marks(a));
		
	}

}
