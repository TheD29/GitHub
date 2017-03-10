package L4;

public class DemancionsArrayMaxElement {

	public static void main(String[] args) {
		int array[][] = { { 5, 4, 15 }, { 3, 10, 11 }, { 3, 1, 35 } };
		int max = array[0][0];
		// int min = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					System.out.println(max);
					// --j;
				}
			}
		}

	}

}
