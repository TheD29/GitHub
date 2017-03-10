package Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintMonth {
	// КАЛЕНДАР НА РІК
	public static void main(String[] args) {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();

		int month1 = 0;// початковий місяць(січень)
		int year = 2017;// рік

		gregorianCalendar.set(year, month1, 1);// встановлюєм початкові
												// параметри
		// Проходимся циклом від 0 місяця до 11
		for (month1 = 0; month1 <= gregorianCalendar.get(Calendar.DECEMBER); month1++) {

			gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);

			int month = gregorianCalendar.get(Calendar.MONTH);
			int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

			System.out.println("ПН ВТ СР ЧТ ПТ СБ НД");

			// if (Calendar.MONDAY != weekday)
			for (int i = Calendar.MONDAY; i < weekday; i++) {
				System.out.print("   ");
			}
			// if (weekday > Calendar.MONDAY)
			for (int i = weekday; i < Calendar.MONDAY; i++) {
				System.out.print("                  ");
			}

			do {
				int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
				System.out.printf("%2d", day); // %2d означає що число має
												// складатись з двох символів//
												// якщо
												// менше ставиться пробіл перед
												// числом

				System.out.print(" ");

				if (weekday == Calendar.SUNDAY)
					System.out.println();

				gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);

				weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

			} while (gregorianCalendar.get(Calendar.MONTH) == month);
			System.out.println();
		}
	}

}
