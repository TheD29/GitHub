package L3;

public class Exercise4 {

	public static void main(String[] args) {
		int i,k;
		for ( k = 0; k <= 2; k++) {			
		
		for ( i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
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
		}
		

	}

}
