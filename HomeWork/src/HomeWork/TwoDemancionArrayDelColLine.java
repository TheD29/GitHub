package HomeWork;

public class TwoDemancionArrayDelColLine {

	public static void main(String[] args) {
		//Видалення рядка та стовпця для багатьох максимумів
		int array[][] = { { 5, 4, 15, 41 }, { 15, 35, 55, 3 }, { 43, 15, 25, 1 }, { 15, 23, 21, 3 } };
		int max = array[0][0];
		int iPos = 0;
		int jPos = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					iPos = i;
					jPos = j;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (iPos == i)
				for (int j2 = 0; j2 < array.length; j2++) {
					array[i][j2] = 0;
					// System.out.print(array[i][j2]);
				}
			for (int j = 0; j < array[i].length; j++) {
				if (j == jPos) {
					array[i][j] = 0;
				}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
