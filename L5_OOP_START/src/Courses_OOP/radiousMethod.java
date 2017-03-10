package Courses_OOP;

public class radiousMethod {
	double radiouse;
	double sum;
	private double rSum;
	//Ініціалізація конструктора з змінними
	public radiousMethod(double r) {
		radiouse = r;
	}
	//ініціалізація конструктора без змінних
	public radiousMethod() {
	}
	public String toString() {
		return "radiust write to String :" + radiouse;
	}
	public void show() {
		System.out.println((Math.PI * radiouse) * 2);
	}

	public double show2(double radi) {
		sum = (Math.PI * radi) * 2;
		return sum;
	}

	public double rsGet() {
		return rSum;
	}

	public void rsSet(double rsVal) {
		rSum = (Math.PI * rsVal) * 2;
	}
		
}
