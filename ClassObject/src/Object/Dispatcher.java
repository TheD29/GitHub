package Object;

public class Dispatcher {

	public static void main(String[] args) {
		model model = new model("The", "Dima");
		model model2 = new model("1", "firstName");
		System.out.println(model);
		System.out.println(model.equals(model2));
		
		System.out.println(model.getClass());
	}

}
