package radhikaM;

class temp {
	public static void main(String args[]) {
		float f;
		double c;
		f = Float.valueOf(args[0]).floatValue();
		c = (f - 32) / 1.8;
		System.out.println("Temp. in Farnehite:" + f);
		System.out.println("Temp. in celsius:" + c);
	}
}