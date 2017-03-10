package test;

public class Dimatest {

	public static void main(String[] args) {
			//Всі числа які діляться на 2
		int nums[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int b = 2;
		int i;
		for (i = 0; i <= 10; i++) {
			if (nums[i] % 2-1 != 0) {
				System.out.println(nums[i]);
			}

		}

	}
}
