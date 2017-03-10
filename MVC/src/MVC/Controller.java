package MVC;

public class Controller {
	public static Fraction add(Fraction f1, Fraction f2) {
		Fraction f = new Fraction();
		f.setDenumerator(f1.getDenumerator() * f2.getDenumerator());
		f.setNumerator(f1.getDenumerator() * f2.getNumerator() + f1.getNumerator() * f2.getDenumerator());
		return f;
	}

	public static Fraction min(Fraction f1, Fraction f2) {
		Fraction f = new Fraction();
		f.setDenumerator(f1.getDenumerator() * f2.getDenumerator());
		f.setNumerator(f1.getNumerator() * f2.getDenumerator() - f1.getDenumerator() + f2.getNumerator());
		return f;
	}

	public static Fraction mult(Fraction f1, Fraction f2) {
		Fraction f = new Fraction();
		f.setDenumerator(f1.getDenumerator() * f2.getDenumerator());
		f.setDenumerator(f1.getNumerator() * f2.getNumerator());
		return f;
	}

	public static Fraction div(Fraction f1, Fraction f2) {
		Fraction f = new Fraction();
		f.setDenumerator(f1.getNumerator() / f2.getDenumerator());
		f.setDenumerator(f1.getDenumerator() / f2.getNumerator());
		return f;
	}

}
