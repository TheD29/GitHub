package Forniture;

public final class Sofa extends model {

	public Sofa(String name, boolean isAssemble) {
		super(name, isAssemble);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		System.out.println("Assemble sofa");
	}

	@Override
	public void disassemble() {
		System.out.println("Disamle sofa");
	}

}
