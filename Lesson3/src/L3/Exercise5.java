package L3;

public class Exercise5 {

	public static void main(String[] args) {
		//пустий ромб
		int n, j;
		for (j = 0; j < 7; j++) {
			for (int j2 = j; j2 < 7; j2++) {
				System.out.print(" ");
			}

			System.out.print(".");
			for (int j2 = 0; j2 < j; j2++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < j; j2++) {
				System.out.print(" ");
			}
			System.out.print(".");
			System.out.println("");

		}

		for (n = 0; n < 7; n++) {
			for (int j2 = 0; j2 < n; j2++) {
				System.out.print(" ");
			}

			System.out.print(".");
			for (int j2 = n; j2 < 7; j2++) {
				System.out.print(" ");
			}
			for (int j2 = n; j2 < 7; j2++) {
				System.out.print(" ");
			}
			System.out.print(".");
			System.out.println("");
		}

	}

}
