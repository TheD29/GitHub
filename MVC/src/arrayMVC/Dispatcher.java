package arrayMVC;

import MVC.modelMVC;

public class Dispatcher {

	public static void main(String[] args) {
		int arrays[] = { 4, 6, 12, -1 };
		Controller controller = new Controller(arrays);
		controller.getMaxMin(arrays);

	}

}
