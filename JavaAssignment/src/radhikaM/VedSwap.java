package radhikaM;

public class VedSwap {

	int a;
	int b;

	public void swap(int a, int b) 
	{
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a: " + a + "\nb: " + b);

	}

	public static void main(String args[]) {
		VedSwap d = new VedSwap();

		d.swap(Integer.parseInt(args[0]), (Integer.parseInt(args[1])));
		// System.out.println(d.swap(Integer.parseInt(args[0]),(Integer.parseInt(args[1]))));

	}

}