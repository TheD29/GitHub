package test;

import java.util.ArrayList;

public class CrArray {

	public static void main(String[] args) {
		int[] arL = { -5, 2, -17, 44 };
		int[] arS = { 3, 4, 9, 10 };
		int indexL = 0;
		int indexS = 0;
		for (int i = 0; i < arS.length; i++) {
			if (arL[i] % 2 != 0) {
				indexL++;
			}
			if (arS[i] % 2 != 0) {
				indexS++;
			}

		}

		// System.out.println(indexS);
		int res[] = new int[indexL + indexS];
		int resi[] = new int[indexL + indexS];
		int indx = 0;
		int indx2 = 0;
		for (int i = 0; i < res.length; i++) {
			if (arL[i] % 2 != 0 && arS[i] % 2 != 0) {
				res[indx++] = arL[i];
				res[indx++] = arS[i];
				resi[indx2++] = i;
			}
			System.out.print(res[i] + "\t");
			//System.out.print(resi[indx2] + "\t");	
		}
		
		
		
	}

}
