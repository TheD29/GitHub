package Object;

public abstract class Animal {
	// private final String name;// Ключове слово final означає що значення
	// змінної
	// не можна змінити після її ініціалізації
	private int age;
	private String name;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int age) {
		super();// означає що виконається спочатку батьківський класс
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name " + getName() + " age " + getAge();
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	protected abstract void move();
	/*
	 * public void setName() { final String s; s = "ssssss"; // s = "asdas"; не
	 * можна переініцілізувати змінну }
	 */
}
