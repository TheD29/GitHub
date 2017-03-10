package test;

public class Max {

	public static void main(String[] args) {
		//серенє арифметичне та кількість елементів більших за це число
		int nums[] = { 9, 1, 3, 4, 5, 6, 7, 78, 8, 10 };
		int sum = 0;
		int allsum = 0;
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			count++;
		}
		allsum = sum / count;
		System.out.println("Середнє арифметичне " + allsum);

		for (int i = 0; i < nums.length; i++) {
			if (allsum < nums[i]) {
				count2++;
				System.out.println("Число більше за среднє арифметичне " + nums[i]);
			}

		}
		System.out.println(count2);
	}

}
