package Primitive;

public class Test {
	int i;
	int j;

	public Test(int i, int j) {
		this.i = 5;
		this.j = 10;
	}

	public void meth(Test test) {
		test.i += test.j;
	}
}
