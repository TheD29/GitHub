package OOPS;

public class FiClass {
	double width;
	double height;
	double depth;

	void vol() {
		System.out.print("Об'єм рівний:");
		System.out.println(width*height*depth);
	}
	
	public class myboxDemo {
		FiClass myFi1 = new FiClass();
		FiClass myFi2 = new FiClass();
		
		//myFi1.width = 10;
	}
}