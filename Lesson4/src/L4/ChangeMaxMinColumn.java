package L4;

public class ChangeMaxMinColumn {

	public static void main(String[] args) {
		//міняємо міслями максимум і мінімум
		int n = 3;
		int array[][] = { { 5, 35, 15 }, { 15, 12, 3 }, { 13, 25, 11 } };
		int maxArr[][] = new int[n][n];
		int minArr[][] = new int[n][n];
		int arrColumnMin = 0;
		int arrColumntMax = 0;
		int min = array[0][0];
		int max = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					arrColumntMax = j;
				} else if (min > array[i][j]) {
					min = array[i][j];
					arrColumnMin = j;
				}

			}

		}

		for (int i = 0; i < minArr.length; i++) {
			for (int j = 0; j < minArr.length; j++) {
				if (max != 0 & arrColumntMax == j) {
					maxArr[i][arrColumntMax] = array[i][arrColumntMax];
				}
				if (min != 0 & arrColumnMin == j) {
					minArr[i][arrColumnMin] = array[i][arrColumnMin];
				}
				// System.out.print(maxArr[i][j]);
				// System.out.print(minArr[i][j]);
			}
			// System.out.println();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == arrColumntMax) {					
					array[i][j] = minArr[i][arrColumnMin];
				}else if (j == arrColumnMin) {
					array[i][j] = maxArr[i][arrColumntMax];
				}

				System.out.print(array[i][j] + "\t");
				//System.out.print(minArr[i][j]);
			}
			System.out.println();
		}
	}

}
