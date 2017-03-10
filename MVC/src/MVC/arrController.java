package MVC;

public class arrController {

	arrModel model;

	public arrController(arrModel m) {
		model = m;
	}

	arrModel getUpdateArrays(int rows) {
		int[] temp = updateRows(model.getArrays()[rows]);
		// model.getArrays()[rows] = temp;
		int[][] temps = model.getArrays();
		temps[rows] = temp;
		return model;
	}

	private int[] updateRows(int[] array) {
		int max = array[0];
		int min = array[0];
		int indexMax = 0;
		int indexMin = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				indexMax = i;
			} else if (min < array[i]) {
				min = array[i];
				indexMin = i;
			}
		}

		array[indexMax] = min;
		array[indexMin] = max;
		return array;
	}

}
