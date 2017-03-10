package arrayMVC;

public class Controller {

	public Controller(int array[]) {
	}

	public int[] getMaxMin(int[] array) {
		int min = array[0];
		int max = array[0];
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				minIndex = i;
			} else {
				max = array[i];
				maxIndex = i;
			}
			array[maxIndex] = max;
			array[minIndex] = min;
		}
		return array;
	}
	

}
