package Object;

public class AnimalDispatcher {

	public static void main(String[] args) {
		// animal.move();

		Animal animal2 = new Dog("Rex", 10);
		animal2.move();
		System.out.println(animal2.getName() + ' ' + animal2.getAge());

		Animal animal3 = new Bierd();
		animal3.move();
		if (animal2 instanceof Dog) {// intstace off перевіряє чи належить обєк
										// класу
			System.out.println("Animal ==  dog");
		} else {
			System.out.println("animal != dog");
		}
	}

}
