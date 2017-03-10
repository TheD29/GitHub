package L3;

public class Exercise3 {

	public static void main(String[] args) {
			//Заповнений ромб
		int i;
		int k;
		for (i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(".");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(".");
			}
			System.out.println("");
		}
		//малюєм низ
		for (k = 0; k < 10; k++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = k; j < 10; j++) {
				System.out.print(".");
			}
			for (int j = k; j < 10; j++) {
				System.out.print(".");
			}
			System.out.println("");
		}

	}

}
