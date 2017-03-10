package Forniture;

public class Main {

	public static void main(String[] args) {
		model sofa = new Sofa("Sofa", true);
		model wardarobe = new wardrobe("WardRobe", false);
		Controller controller = new Controller(sofa);
		controller.master();

		Controller controller2 = new Controller(sofa);
		System.out.println(controller2.master());

		if (sofa.isAssemble() == true) {
			sofa.assemble();
		} else {
			sofa.disassemble();
		}
		if (wardarobe.isAssemble() == true) {
			wardarobe.assemble();
		} else {
			wardarobe.disassemble();
		}
	}

}