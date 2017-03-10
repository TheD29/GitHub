package test;

public class arifmeatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 100 };

		double average = 0;
		if (numbers.length > 0) {
			double sum = 0;
			for (int j = 0; j < numbers.length; j++) {
				sum += numbers[j];
			}
			average = sum / numbers.length;
			System.out.println(average);
		}
	}
}
