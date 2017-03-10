package Courses_OOP;

public class Dispatcher {

	public static void main(String[] args) {
		MyModel mod = new MyModel(15.5, 15.6); // ініцілізація значень
												// конструктора
		System.out.println("виведення значень конструктора: " + mod.d1 + ' ' + mod.d2);
		System.out.println(mod.height + mod.width);
		mod.eSum();
		// Використання вхыдних змінних для методу
		mod.eSum2(8.6, 9.4);
		// Використання return(метод 3)
		double res = mod.eSum3(15.6, 26);
		System.out.println("Сума елементів методу 3: " + res);
		mod.eSum4(50, 25.5);

		MyModel mod1 = new MyModel(5.6, 55);
		// System.out.println(mod1.d1 + ' ' + mod.d2);
		System.out.println("Sum d1 d2" + ' ' + (mod.d1 + mod.d2));
		System.out.println("Sum d1 d2" + ' ' + (mod1.d1 + mod1.d2));
		//Інкапсуляція
		
		MyModel mod2  = new MyModel();		
		mod2.setP1(25.3);
		System.out.println("Private (Інкапсуляція) : " + mod2.getP1());
	}
}
