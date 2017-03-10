package L4;

public class Foreach {

	public static void main(String[] args) {
		System.out.println("l " + args.length);
		for (String s : args) {
			System.out.println("s " + s);
		}
	}

}
