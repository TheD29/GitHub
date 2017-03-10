package MVC;

public class Fraction {
	int numerator;
	int denumerator;

	public Fraction(int n, int d) {
		numerator = n; // ЧИСЕЛЬНИК
		denumerator = d; // ЗНАМЕННИК
	}
	public Fraction() {
		// TODO Auto-generated constructor stub
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int n) {
		this.numerator = n;
	}

	public int getDenumerator() {
		return denumerator;
	}

	public void setDenumerator(int n) {
		this.denumerator = n;
	}

}
