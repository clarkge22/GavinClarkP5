
public class Fraction {
	
	public int num;
	
	public int den;
	
	public Fraction() {
		num = 1;
		den = 2;
	}
	
	public Fraction(int numA, int denB) {
		num = numA;
		den = denB;
	}
	
	public static void add(double numA, double denA, double numB, double denB) {
		double hold = denA;
		denA *= denB;
		numA *= denB;
		denB *= hold;
		numB *= hold;
		double newNum = numA + numB;
		String result = Integer.toString((int)newNum) + " / " + (int)denA;
		System.out.println(result);
	}
	
	public static void subtract(double numA, double denA, double numB, double denB) {
		double hold = denA;
		denA *= denB;
		numA *= denB;
		denB *= hold;
		numB *= hold;
		double newNum = numA - numB;
		String result = Integer.toString((int)newNum) + " / " + (int)denA;
		System.out.println(result);
	}
	
	public static void multiply(double numA, double denA, double numB, double denB) {
		denA *= denB;
		numA *= numB;
		String result = Integer.toString((int)numA) + " / " + (int)denA;
		System.out.println(result);
	}
	
	public static void divide(double numA, double denA, double numB, double denB) {
		double hold = numB;
		numB = denB;
		denB = hold;
		denA *= denB;
		numA *= numB;
		String result = Integer.toString((int)numA) + " / " + (int)denA;
		System.out.println(result);
	}
}
