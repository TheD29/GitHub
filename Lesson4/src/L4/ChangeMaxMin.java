package L4;

public class ChangeMaxMin {

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 4 }, { 10, 13, 3 }, { 5, 7, 15 } };
		int min = array[0][0];
		int max = array[0][0];
		int minArr[][] = new int[3][3];
		int maxArr[][] = new int[3][3];
		int maxLineNum = 0;
		int minLineNum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					// maxArr[i][j] = array[i][j];
					maxLineNum = i;
				} else if (min > array[i][j]) {
					min = array[i][j];
					minLineNum = i;
				}

			} // end second for

		} // end first for

		for (int i = 0; i < maxArr.length; i++) {
			for (int j = 0; j < maxArr.length; j++) {
				if (i == maxLineNum) {
					maxArr[maxLineNum][j] = array[maxLineNum][j];
				}
				if (i == minLineNum) {
					minArr[minLineNum][j] = array[minLineNum][j];
				}
			}
			System.out.println();
		}

		for (int i = 0; i < maxArr.length; i++) {
			for (int j = 0; j < maxArr.length; j++) {
				array[minLineNum][j] = maxArr[maxLineNum][j];
				array[maxLineNum][j] = minArr[minLineNum][j];
				System.out.print(array[i][j]);
			}
			System.out.println();

		}

	}
}
