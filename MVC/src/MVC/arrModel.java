package MVC;

public class arrModel {
	int arrays[][];

	// int array[][] = { { 4, 6, 12, 6, -3 }, { 6, 4, 3, 2 }, { 6, 4, 3, 2 }, {
	// -1, 12, 6, 1 } };
	public arrModel(int arr[][]) {
		arrays = arr;
	}

	public int[][] getArrays() {
		return arrays;
	}

	public void setArrays(int[] arr, int rows) {
		arrays[rows] = arr;
	}
}
