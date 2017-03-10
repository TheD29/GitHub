package L2;

public class float_type {

	public static void main(String[] args) {
		
		//для оголошення числа типу float в кінці значення потрібно обов язково ставити оголошену змінну
		//якщо записувати без змінної в кінці буде помилка тому що  система може подумати що ще double
		float f = 10.8f;
		//casting
		float r  = (float)15.53;
		
		System.out.println(f);
		System.out.println(r);
		
		double d  = 12.5;
		float g = 8.3f;
		
		double res = d/g;
		
		System.out.println(res);
		
		double d2  = 12.5;
		float g2 = 8.3f;
		
		float res2 = (float)d2/g2;
		
		System.out.println(res);
		
		float g3 = 10f;
		System.out.println(g3);
	}

	
}
