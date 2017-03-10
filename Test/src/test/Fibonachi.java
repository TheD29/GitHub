package test;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int n1 = 1;
		int s;
		//int s2;

		for (int i = 0; i < 10; i++) {
			s = n + n1;
			n = n1;
			n1 =s;
			/*
			 * for (int j = 0; j < 10; j++) { s = n+n1; n1=s;
			 * System.out.println(s); }
			 */
			System.out.println(s);
		}
		/*for (int i = 0; i < 10; i++) {
			s2 = n1 + n;
			n1 = s2;
			System.out.println(s2);
		}*/

	}

}
