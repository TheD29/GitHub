package Local;

public class LocalOuterClass {
	public LocalOuterClass() {

	}

	public void getLocalClass() {
		class LocalClass implements OutInterface {
            public void somePrinnt( ) {
                System.out.println("Локальний клас імлементований з інтерфейсу");
            }
        }
		LocalClass class1 = new LocalClass();
		class1.somePrinnt();
	}

}
