package InClassses;

public class Dispatcher {

	public static void main(String[] args) {
		// Варіант виклику внутрішнього класу 1
		OuterClass outerClass = new OuterClass();
		OuterClass.innerClass innerClass = outerClass.new innerClass();
		innerClass.print();
		// Варіант 2 виклику внутрішнього класу
		OuterClass.innerClass class1 = new OuterClass().new innerClass();
		outerClass.Some();
		class1.print();

	}

}
