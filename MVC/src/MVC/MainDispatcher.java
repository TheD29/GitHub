package MVC;

public class MainDispatcher {
	public static void main(String str[]) {
		modelMVC m = new modelMVC(21.9, 6.5);
		double resAdd = ControllerMVC.add(m);
		double resMin = ControllerMVC.min(m);
		double resMult = ControllerMVC.mult(m);
		double resDiv = ControllerMVC.div(m);

		viewMVC.print(m);
		viewMVC.print("Add", resAdd);
		viewMVC.print("Min", resMin);
		viewMVC.print("Mult", resMult);
		viewMVC.print("Div", resDiv);

	}

}
