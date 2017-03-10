package stringOperation;

import java.awt.image.ReplicateScaleFilter;

public class strings {

	public static void main(String[] args) {
		char c[] = { '1', '2', '3', '4', 'A', 'B' };
		String s = new String(c, 2, 3);
		System.out.println(s + " ");

		byte b[] = { 64, 65, 66, 67, 68 };
		String sb = new String(b);
		System.out.println(sb);
		System.out.println(sb.length());
		// Порівняння строк
		String s1 = new String("AB");
		String s2 = new String("AB");
		System.out.println(s1.equals(s2));// порівння вмістру строки return true
		System.out.println(s1 == s2);// порівняння ссилок на обєкти повертає
										// false

		// Get string index
		String s3 = "Java";
		char ch = s3.charAt(2);
		System.out.println("Поверня значення строки: " + ch);
		// Запис строки в масив
		String ss = "Java SE 6";
		int indS = 0;
		int indE = 7;
		char ch2[] = new char[indE - indS];
		ss.getChars(indS, indE, ch2, 0);
		System.out.println(ch2);

		String ss1 = "Java SE 6 2";
		String ss2 = "Java SE 6 2";

		System.out.println(ss1.compareTo(ss2));

		String l = "Замінити всі голосні літери";
		String l2 = "і";
		String l3 = "*";
		// Замінити а о у е і
		System.out.print(l.replaceAll(l2, l3));
		
		
		

	}

}
