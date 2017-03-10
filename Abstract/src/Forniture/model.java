package Forniture;

public abstract class model {
	private String name;
	private boolean isAssemble;

	public model(String name, boolean isAssemble) {
		this.name = name;
		this.isAssemble = isAssemble;
	}

	public abstract void assemble();

	public abstract void disassemble();

	public boolean isAssemble() {
		return isAssemble;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}