package test;

public class arraay_operation2 {
	public static void main(String[] args) {
		// операції з масивами (копіювання, багатовимірні масиви)
		// додавання двох масивів одникової довжини
		int[] arrNum = { 1, 10, 25 };
		int[] arrNum2 = { 5, 8, -3 };
		int result[] = new int[3];
		for (int i = 0; i < arrNum.length; i++) {
			result[i] = arrNum[i] + arrNum2[i];
			 System.out.println(result[i]);
		}
		//Foreach не працює  додавання масивів!!!!!!!!!!!
	//	for (int l : arrNum) {
		//	result[l] = arrNum[l] + arrNum2[l];
			//System.out.println(result[l]);
		//}
		// ****************************************************************
		// Конкантенація двох масивів в третій
		int[] arL = { 1, 2, 3, 45, 6, 78 };
		int[] arS = { 4, 7, 8, 10 };
		int[] res = new int[arL.length + arS.length];
		int IndexL = 0;
		int IndexS = 0;
		for (int i = 0; i < res.length; i++) {
			//System.arraycopy(arL, 0, res, 0, arL.length);
			//System.arraycopy(arS, 0, res, arL.length, arS.length);
			//System.out.print("," + res[i]);
		}

	}

}