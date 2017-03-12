package Inter;

public interface Animal extends Creature {
	final static String name = "Animal";

	@Override
	default void move() {
	}

	default void setting() {
		System.out.println("setting setting");
	}
}
