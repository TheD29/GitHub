package GCMVC;

import java.nio.channels.CancelledKeyException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dispatcher {

	public static void main(String[] args) {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		Model model = new Model(2017, 11, 29);
		for (int i = model.getYear(); i < 2022; i++) {
			gregorianCalendar.set(Calendar.MONTH, model.getMonth1());
			gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);

			int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

			View.printDay();
			for (int j = Calendar.MONDAY; j < weekday; j++) {
				System.out.print("   ");
			}

			for (int j = weekday; j < Calendar.MONDAY; j++) {
				System.out.print("                  ");
			}
			do {
				int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
				System.out.printf("%2d", day); // %2d означає що число має
												// складатись з двох символів//
												// якщо
												// менше ставиться пробіл перед
												// числом
				if (day == model.getBirthday()) {
					System.out.print("*");
				} else
					System.out.print(" ");

				if (weekday == Calendar.SUNDAY)
					System.out.println();

				gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);

				weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

			} while (gregorianCalendar.get(Calendar.MONTH) == model.getMonth1());

			View.printLine();
		}

	}

}
