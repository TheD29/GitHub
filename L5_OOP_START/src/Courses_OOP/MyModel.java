package Courses_OOP;

public class MyModel {
	double width = 10.2;
	double height = 5.4;
	double d1;
	double d2;
	// Інкапсуляція захист полів від змін
	private double p1;

	// задання параметрів конструктору
	// явний конструктор
	public MyModel(double b1, double b2) {
		d1 = b1;
		d2 = b2;
	}

	// ініціалізація конструктора без параметрів
	public MyModel() {
	}
	

	

	public void eSum() {
		System.out.println("Сума елементів : " + (width + height));
	}

	public void eSum2(double w1, double w2) {
		System.out.println("Сума елементів методу eSum2 : " + (w1 + w2));
	}

	public double eSum3(double e1, double e2) {
		return e1 + e2;
	}

	// Інкапсуляція
	public double getP1() {
		return p1;
	}

	public void setP1(double p) {
		p1 = p;
	}

	public void eSum4(double r1, double r2) {
		width = r1 + r2;
		System.out.println("Метод 4: " + width);
	}

}
