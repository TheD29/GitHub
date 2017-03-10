package HomeWork;

public class ArrayUpColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = { { 5, 4, 15, 41 }, { 15, 35, 55 }, { 43, 15 }, { 18, 23, 21, 3, 6 } };
		int lineNum = 3;
		int step = 1;
		int minLenth = array.length;
		int val = 0;
		int val2 = 0;
		int val3 = 0;
		int lCount = 0;
		for (int i = 0; i < array.length; ++i) {
			lCount++;
			for (int j = 0; j < array[i].length; j++) {
				if (minLenth > array.length) {
					minLenth = array[i][j];
				}
			}
		}
		System.out.println(minLenth);

		for (int i = 0; i < step; ++i) {

			switch (lineNum) {
			case 0:
				val = array[0][lineNum];
				val2 = array[i + 1][lineNum];
				array[i + 1][lineNum] = val;
				array[0][lineNum] = array[3][lineNum];
				val3 = array[lCount - 2][lineNum];
				array[lCount - 1][lineNum] = val3;
				array[lCount - 2][lineNum] = val2;
				break;
			case 1:
				val = array[0][lineNum];
				val2 = array[i + 1][lineNum];
				array[i + 1][lineNum] = val;
				array[0][lineNum] = array[3][lineNum];
				val3 = array[lCount - 2][lineNum];
				array[lCount - 1][lineNum] = val3;
				array[lCount - 2][lineNum] = val2;
				break;
			case 2:
				val = array[0][lineNum];
				val2 = array[i + 1][lineNum];
				array[i + 1][lineNum] = val;
				array[0][lineNum] = array[3][lineNum];
				array[lCount - 1][lineNum] = val2;
				break;
			case 3:
				val = array[0][lineNum];
				array[0][lineNum] = array[3][lineNum];
				array[lCount - 1][lineNum] = val;

				break;
			default:
				break;
			}

			/*
			 * if (minLenth - 1 <= array[i].length) for (int j = 0; j < lineNum;
			 * ++j) { val2 = array[i][lineNum]; array[i][lineNum] = val; // val2
			 * = val; System.out.println(val2);
			 * 
			 * }
			 */

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
