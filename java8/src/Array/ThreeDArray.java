package Array;

public class ThreeDArray {

	public static void main(String args[]) {

		int[][][] list = new int[3][2][2];

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				for (int k = 0; k < list[i][j].length; k++) {
					System.out.println(list[i][j][k]);
				}
			}
		}

		int[][][] array = { { { 10, 20, 30 } }, { { 40, 50 } }, { { 60, 70, 80, 90 } } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.println(array[i][j][k]);

				}

			}
		}
		System.out.println(array[0][0][1]);
		int[][] array2 = new int[10][];
		for (int i = 0; i < array2[i].length; i++) {
			System.out.println(array2[i]);

		}
	}
}