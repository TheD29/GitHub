package L3;

public class TernarOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		// boolean c = a == b ? true : false;
		int c = a == b ? a : a < b ? a : b;
		System.out.println(c);
		// false
		long a1 = 10;
		long b1 = 8;
		// boolean c = a == b ? true : false;
		int c1 = a1 == b1 ? (int) a1 : (int) b1;
		System.out.println(c);

		// && замикальне & якщо а істина перевіряється другий оператор якщо не істина друга перевірка не виконується 
		if (a == b && a == b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}
