package L3;

public class zadacha {

	public static void main(String[] args) {

		int i, j;

		for (i = 0; i < 10; ++i) {
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print(" ");
			}
			for (j = i; j < 10; j++) {
				System.out.print(".");
			}
			
			for (int j2 = i; j2 < 10; j2++) {
				System.out.print(".");
			}

			System.out.println();

		}

	}

}
