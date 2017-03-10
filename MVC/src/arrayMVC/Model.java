package arrayMVC;

public class Model {
	int array[];
	private int max;
	private int min;

	public Model() {

	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setMin(int min) {
		this.min = min;
	}

}
