//Q2 WAP for StudentInfo

package gayatri;

public class StudentInfo {
	void display(int num, String Name, int marks) {
		System.out.println("Roll number is : " + num);
		System.out.println("Name of the student is : " + Name);
		System.out.println("Marks are :" + marks);

	}

	public static void main(String args[]) {

		new StudentInfo().display(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]));
	}

}
