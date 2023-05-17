package assignment2;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] twoDimArray = new int[2][5];
		int[] arrayOne = {5, 9, 55, 23, 89};
		int[] arrayTwo = {15, 3, 23, 19, 64};
		
		for(int i = 0; i < 2; i++) {
			int[] arr = new int[5];
			if (i == 0) {
				for(int p = 0; p < 5; p++) {
					arr[p] = arrayOne[p];
				}
			}
			else {
				for(int p = 0; p < 5; p++) {
					arr[p] = arrayTwo[p];
				}
			}
			//System.out.println(Arrays.toString(twoDimArray));
			for(int j = 0; j < 5; j++) {
				twoDimArray[i][j] = arr[j];
			}
		}
		
		/* copy arrayOne and arrayTwo into twoDimArray */
		/* print out the first list of 5 numbers in twoDimArray
		 * on one line, and the second list of 5 numbers in twoDimArray
		 * on the next line
		 */
		
		/* the solution should use nested loops: one loop to loop over
		 * each array in twoDimArray, and one loop to loop over each element
		 * in that array
		 */
		System.out.print("twoDimArray is ");
		for(int i = 0; i < 2; i++) {
			System.out.print("[");
			for(int j = 0; j < 5; j++) {
				System.out.print(twoDimArray[i][j] + " ");
			}
			System.out.print("] ");
		}
	}
}
