package L3;

public class Cicles {

	public static void main(String[] args) {
		//мітка поля. Брейк обірве виконання програми на самому початку програми
		m: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					break m;
				}
				System.out.println("day " + i + " eat " + j);
			}
		}

	}

}
