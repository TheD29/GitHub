package HomeWork;

public class Firstcomputer {
	private int ram;
	private String name,hddType;
	private int HDD;
	
	
	void cName() {
		System.out.println("Модель ноута" +' ' + name);
	};

	
	public int getRam() {
		return ram;
	}
	public void setRam(int nRam) {
		if (nRam > 0) {
			ram = nRam;
			System.out.println("Розмір оперативної пам'яті" + ' ' + ram + "Гб");
		}else{
			System.out.println("Передані значення не вірні:"  + ram);
		}
	}
	
	void cRam() {
		System.out.println("Розмір оперативної пам'яті" + ' ' + ram + "Гб");
	}

	void cHDD() {
		System.out.println("SSD" + ' ' + "256Гб"  + ' ' + hddType);
	}
	
	public int getHdd() {
		return HDD;
	}
	
	public void setHdd(int nHDD) {
		if (nHDD > 0){
			HDD = nHDD;
			System.out.println("Розмір памяті жорсткого диску: " + HDD + "Гб");
		}
	}
}
