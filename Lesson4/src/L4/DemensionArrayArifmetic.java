package L4;

public class DemensionArrayArifmetic {

	public static void main(String[] args) {
		// Середнє ариметичне кожного рядка масиву
		int array[][] = { { 15, 10, 5, 3 }, { 1, 5, 4, 8 }, { 7, 6, 2, 1 }, { 22, 50, 80, 11 } };
		double sum = 0;
		int count = 0;
		double elementSum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = array[i][j] + sum;
				count++;
			}
			sum = sum / count;
			//System.out.println(sum);

			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array[i].length; j2++) {
					elementSum =  array[j][j2] - sum;
				
				}
				System.out.print(elementSum + "\t");	
				
			}
			System.out.println();
			count = 0;
			sum = 0;
			elementSum = 0;
		}
	}

}
