package Courses_OOP;

public class radius {

	public static void main(String[] args) {
		radiousMethod rm = new radiousMethod();
		rm.radiouse = 15.6;
		rm.show();
		//Використання Return
		rm.show2(12);
		System.out.println("Show 2 через return: " + rm.sum);
		//Інкапсуляція
		rm.rsSet(12);
		//System.out.println("Вивід private variable(інкапсуляція): " + rm.rsGet());
		//Ініціалізаці змінних в конструкторі
		radiousMethod rm2 = new radiousMethod(12);		
		System.out.print("Вивід з ініціалізацією змінної в конструкторі ");
		rm2.show();
		//Ініціалізація методу ToString
		System.out.println(rm2);
		System.out.println(rm2.toString());
	}

}
