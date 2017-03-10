package L2;

public class AddOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//операції присвоювання
		int a = 2;
		int b = 3;
		
		//a = a + b;
		a+= b;
		System.out.println(a);
		
		int c = 10;
		b+= ++b;
		System.out.println(b);
		
		System.out.println(a==b);

	}

}
