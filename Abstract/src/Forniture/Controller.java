package Forniture;

public class Controller {
	model model;

	public Controller(model model) {
		this.model = model;
	}

	public String master() {
		if (model instanceof Sofa) {
			Sofa sofa = (Sofa) model;
			if (sofa.isAssemble())
				sofa.isAssemble();
			else
				sofa.disassemble();
			return "done";

		} else if (model instanceof wardrobe) {
			wardrobe wardrobe = (wardrobe) model;
			if (wardrobe.isAssemble())
				wardrobe.isAssemble();
			else
				wardrobe.disassemble();

		}
		return "done";
	}

}