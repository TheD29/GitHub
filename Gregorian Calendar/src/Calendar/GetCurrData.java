package Calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Dima on 3/19/2017.
 */
public class GetCurrData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GetCurrData.main: ");
        String input = scanner.nextLine();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);

        try {
            Date inputDate = dateFormat.parse(input);
            Calendar inputCalendar = Calendar.getInstance();
            inputCalendar.setTime(inputDate);

            Calendar currCalendar = Calendar.getInstance();
            System.out.println("GetInputData.main " + inputDate);
            long res = currCalendar.getTimeInMillis() - inputCalendar.getTimeInMillis();
            System.out.println("GetCurrData.main" + res);
            int days = (int) (res) / (1000 * 60 * 60 * 24);
            System.out.println("days: " + days);

        } catch (ParseException e) {
            System.out.println("Помилка");

        }


    }
}
