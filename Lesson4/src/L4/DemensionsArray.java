package L4;

public class DemensionsArray {

	public static void main(String[] args) {
		int array[][] = { { 4, -3, -2, 1 }, { 13, -2 }, { 6, -1, 8 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].length > 2)
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] >= 0) {
						j++;
						for (; j < array[i].length; j++) {
							if (array[i][j] < 0) {
								sum += array[i][j];

							}

						}
						System.out.println(sum);
						sum = 0;
					}
				}
		}

	}

}
