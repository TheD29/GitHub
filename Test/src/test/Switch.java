package test;


public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String season = null;
		for (int i = 0; i < 12; i++) {
			switch (i) {
			case 1:
				switch (1) {
				case 1:
					season = "Зима";
					break;
				}
				System.out.println("Січень: " + season);
				break;
			case 2:
				System.out.println("Лютий: " + season);
				break;
			case 3:
				switch (3) {
				case 3:
					season = "Весна";
					break;
				}
				System.out.println("Березень: " + season);
				break;
			case 4:
				System.out.println("Квітень: " + season);
				break;
			case 5:
				System.out.println("Травень: " + season);
				break;
			case 6:
				switch (6) {
				case 6: {
					season = "Літо";
					break;
				}
				}

				System.out.println("Червень: " + season);
				break;
			case 7:
				System.out.println("Липень: " + season);
				break;
			case 8:
				System.out.println("Серпень: " + season);
				break;
			case 9:
				switch (9) {
				case 9:
					season = "Осінь";
				}
				System.out.println("Вересень: " + season);
				break;
			default:
				break;
			}
		}
	}

}