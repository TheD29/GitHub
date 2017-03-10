package test;

public class For_Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean done = false;
		i = 0;
		for (; !done;) {
			System.out.println(i);
			if (i == 10)
				done = true;
			i++;

		}

		int nums[] = { 4, 6, 3, 22, 2, 23 };
		int sum = 0;
		int l = nums[0];
		for (int x : nums)
			sum += x;
		System.out.println("Сума елементів масиву рівна:" + sum);
		sum = 0;// Замнулюємо суму щоб в наступному циклі вірно виводилась сума
				// елементів масиву
		for (int c : nums) {
			System.out.println("Значення елементу масиву рівно:" + c);
			sum += c;
		}
		System.out.println("Сума елементів масиву рівна:" + sum);
		sum = 0;
		// сума перших 5 елементів масиву
		for (int d : nums) {
			System.out.println("Значення елементу масива рівно: " + d);
			sum += d;
			if (d == 5)
				break;
		}
		System.out.println("Сума 5 перших елементів масиву рівна: " + sum);
		sum = 0;
		// мінімальний елемент масиву
		int minindex = 0;
		for (int j = 0; j < nums.length; j++) {
			if (l > nums[j]) {
				l = nums[j];
				minindex = j;
			}
		}
		System.out.println("Мінімальний елемент масиву рівний: " + l + " Іденкс рівний " + minindex);
		// максимальний елемент масиву та його індекс
		int max = nums[0];
		int index = 0;

		for (int d = 0; d < nums.length; d++) {
			if (max < nums[d]) {
				max = nums[d];
				index = d;
			}
		}
		System.out.println("Максимальний елемент масиву рівний: " + max + "  " + "Індекс рівний: " + index);

	}

}
