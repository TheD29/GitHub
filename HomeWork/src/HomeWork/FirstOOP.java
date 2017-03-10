package HomeWork;

//import HomeWork.Firstcomputer;

public class FirstOOP {

	public static void main(String[] args) {
		Firstcomputer comp = new Firstcomputer();
		// comp.name = "HP";
		// comp.hddType = "Samsung";
		// comp.ram = 8;
		comp.cName();
		comp.cRam();
		comp.cHDD();

		comp.setRam(8);
		comp.setHdd(256);

	}

}
