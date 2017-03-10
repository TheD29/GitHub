package HomeWork;

public class ArrayUpMeth {

	public void cArray(int aStep) {
		/*
		 * Для максимальної динамічності визначається довжина кожного елементу
		 * масиву відповідно до довжини створюється пустий масив з вказаною
		 * довжиною і позицією перевіряється довжина та переносяться дані в
		 * робочий масив для того щоб працював зсув масиву на декілька строк
		 * потрібно перепресвоїти масив копії нашому головному масиву
		 */
		int step = aStep;
		int array[][] = { { 5, 4, 13, 41 }, { 12, 35, 55 }, { 43, 15 }, { 18, 23, 21, 3, 6 } };
		int lCount = -1;
		int minLenth = array.length;
		int maxLenth = array.length;
		int nArray[][] = new int[4][0];
		nArray[0] = new int[array.length];
		nArray[1] = new int[array.length - 1];
		nArray[2] = new int[array.length - 2];
		nArray[3] = new int[array.length + 1];

		for (int i = 0; i < array.length; ++i) {
			lCount++;
			for (int j = 0; j < array[i].length; j++) {
				if (minLenth > array[i].length) {
					minLenth = array[i].length;
				}

			}

		}
		for (int c = 0; c < step; c++) {
			for (int i = 0; i < array.length - 1; ++i) {
				for (int j = 0; j < minLenth; j++) {
					nArray[0][j] = array[lCount][j];
					nArray[i + 1][j] = array[i][j];
					// System.out.print(nArray[i][j] + "\t");
				}
				// System.out.println();
			}

			for (int i = 0; i < array.length - 1; ++i) {
				// if (minLenth > array.length-2)
				for (int j = 0; j < array[i].length; j++) {
					if (j == array[i].length - 2) {
						nArray[0][j] = array[lCount][j];
						nArray[i + 1][j] = array[i][j];
						// nArray[3][j] = array[3][j];
					} else if (j == array[i].length - 1) {
						nArray[0][j] = array[lCount][j];
						nArray[lCount][j] = array[i][j];
					} else {
						nArray[lCount][array.length] = array[lCount][array.length];
					}
				}
			}
			for (int i = 0; i < nArray.length; i++) {
				for (int j = 0; j < nArray[i].length; j++) {
					array[i][j] = nArray[i][j];
				}
			}
		}

		for (int i = 0; i < nArray.length; i++) {
			for (int j = 0; j < nArray[i].length; j++) {

				System.out.print(nArray[i][j] + "\t");
			}
			System.out.println();
		}

		/*
		 * for (int i = 0; i < nArray.length; i++) { for (int j = 0; j <
		 * nArray[i].length; j++) { System.out.print(array[i][j] + "\t"); }
		 * System.out.println(); }
		 */

	}

}
