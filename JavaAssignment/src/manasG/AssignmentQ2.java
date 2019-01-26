
public class AssignmentQ2 {
	static int rollno, mark;
	static String name;

	static void Name() {
		System.out.println("Student name is " + name);
	}

	static void Marks() {
		System.out.println("Marks are " +mark);
	}

	static void RollNo() {
		System.out.println("Roll number is "+rollno);
	}

	public static void main(String[] args) {
		rollno = Integer.parseInt(args[0]);
		
		mark = Integer.parseInt(args[1]);
		
		name = args[2];
		Name();
		Marks();
		RollNo();
	}
}