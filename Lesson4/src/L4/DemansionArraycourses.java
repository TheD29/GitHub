package L4;

public class DemansionArraycourses {

	public static void main(String[] args) {
		int[][] array = { { 4, 6, 8, 12 }, { 3, 2, 1 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		

	}

}
