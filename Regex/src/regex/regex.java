package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dima on 23.03.2017.
 */
public class regex {

    public static void main(String[] args) {
        /*String s = "12 0x 0x12 0Xf @@";
        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]");/* мета символdecimal тільки числа \\s забирає пробіли  \\w символ слова також вивидоть нижні пробіли*/
       /* Matcher m = pattern.matcher(s);

        while (m.find()) {
            System.out.println(m.group());

        }*/
            /*Квантифікатори (+ . * ? )   */
            /*+ 0 хоча б 1
                * 0 або безліч
                 ? 0 або 1 раз
             */
       /* String s1 = "1 a12 2345";
        Pattern pattern1 = Pattern.compile("\\d*");/* мета символdecimal тільки числа \\s забирає пробіли  \\w символ слова також вивидоть нижні пробіли*/
      /*  Matcher m1= pattern1.matcher(s1);

        while (m1.find()) {
            System.out.println(m1.group());

        }*/
            /*
            () - група символів яка об є днуєтсья в один
            ^ - карат(означає заперечення те що нам не потрібно)
            * - означає що далі щось може бути обо ні
            + - хоба б 1 елемент
            * */
        String s1 = "C  cat ca,t cattie cat";
        Pattern pattern1 = Pattern.compile("\\b(cat)\\b");/* мета символdecimal тільки числа \\s забирає пробіли  \\w символ слова також вивидоть нижні пробіли*/
        Matcher m1 = pattern1.matcher(s1);

        while (m1.find()) {
            System.out.println(m1.group());

        }

    }
}
