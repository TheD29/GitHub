package MVC;

public class ControllerMVC {
	public static double add(modelMVC modelMVC) {
		return modelMVC.getNumberOne() + modelMVC.getNumberTwo();
	}

	public static double mult(modelMVC modelMVC) {
		return modelMVC.getNumberOne() * modelMVC.getNumberTwo();
	}

	public static double div(modelMVC modelMVC) {
		return modelMVC.getNumberOne() / modelMVC.getNumberTwo();
	}

	public static double min(modelMVC modelMVC) {
		return modelMVC.getNumberOne() - modelMVC.getNumberTwo();
	}

}
