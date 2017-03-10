package L3;

public class Exercise2 {

	public static void main(String[] args) {
		//Трикутник
		int i, j;

		for (i = 0; i < 10; ++i) {
			for ( j = i; j < 10; j++) {
				System.out.print(" ");
			}
			
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print(".");
			}
			
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print(".");
			}
			System.out.println();

		}

	}

}
