package test;

public class for_array_opperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// кількість та сума непарних елементів масиву
		// діапазоні від 0 до 30
		int nums[] = { 10, 2, 23, 8, -6, 25, 30, 35, 105 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				if (nums[i] >= 0 & nums[i] <= 20) {
					count = count + 1;
					sum += nums[i];
				}
			}

		}
		System.out.println(sum);
		System.out.println(count);
		// ******************************************************************//
		// Визначення мінімального числа парних і максимального числа непарних
		// чисел
		int max = nums[0];
		int min = nums[0];

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] % 2 == 0 & min > nums[j]) {
				min = nums[j];
			}

			if (nums[j] % 2 != 0 & max < nums[j]) {
				max = nums[j];
			}

		}
		System.out.println("Мінімальне число з масиву парних чисел: " + min);
		System.out.println("максимальне число масиву непарних чисел " + max);
		//Знайти всі відємні елементи масиву та змінити їх нзак на протилежний
		int negative = 0;
		int nNum = 0;
		for (int k = 0; k < nums.length; k++) {
			if (negative > nums[k]) {
				//Міняємо відємне число елементу на додатнє
				nNum = nums[k]*-1;
				//nNum = nNum*-1;
				System.out.println("Всі відємні елементи масиву :" + nNum);
			}
		}
	}
}
