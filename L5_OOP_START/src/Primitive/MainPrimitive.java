package Primitive;

public class MainPrimitive {

	public static void main(String[] args) {
		Test test = new Test(5, 10);
		
		test.meth(test);
		System.out.println(" " + test.i + "  " + test.j);
	}

}
