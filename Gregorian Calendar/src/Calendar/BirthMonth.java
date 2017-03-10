package Calendar;

import java.security.PublicKey;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthMonth {

	public static void main(String[] args) {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		// Вивести календар на 10 місяців вперед
		// Вивести місяць і зірочку з власним днем народження і продублювати на
		// 5 років
		// int year = 2019;
		int month1 = 11;
		int birthday = 29;
		
		for (int year = 2017; year <= 2022; year++) {
			
			gregorianCalendar.set(year, month1, 1);
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
				if (day == birthday) {
					System.out.print("*");
				} else
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