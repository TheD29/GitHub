package MVC;

public class ArrayDisp {

	public static void main(String[] args) {
		int arrays[][] = { { 4, 6, 12, -1 }, { 6, 4, 3, 2 }, { 6, 5, 1, 2 }};
		arrModel model = new arrModel(arrays);
		arrController controller = new arrController(model);
		arrModel modRes = controller.getUpdateArrays(2);

		for (int i = 0; i < modRes.getArrays().length; i++) {
			arrView.printRows(i);
			for (int element : modRes.getArrays()[i]) {
				arrView.print(element);
			}
		}
	}
}
