package MVC;

public class disp {

	public static void main(String[] args) {
		Fraction f = new Fraction(4, 8);
		Fraction f2 = new Fraction(1, 9);
		Fraction fadd = Controller.add(f, f2);
		// f.setDenumerator(5);
		// f.setNumerator(10);
		View.print(fadd);
	}

}
