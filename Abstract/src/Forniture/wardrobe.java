package Forniture;

public final class wardrobe extends model {

	public wardrobe(String name, boolean isAssemble) {
		super(name, isAssemble);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		System.out.println("Assemble wardrobe");

	}

	@Override
	public void disassemble() {
		System.out.println("Disamble wardrobe");
	}

}
