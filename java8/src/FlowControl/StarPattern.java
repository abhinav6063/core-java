package FlowControl;

public class StarPattern {
	static public void printTriangle() {
		int rc = 5;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			sc++;
			System.out.println();
		}

	}

	public static void printSquare() {
		int rc = 3;
		int sc = 3;
		for (int i = 0; i < rc; i++) {

			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void printLeftTraingle() {
		int rc = 5;
		int bsc = 4;
		int sc = 1;

		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < bsc; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < sc; k++) {
				System.out.print("*");
			}
		sc++;
		bsc--;
		System.out.println();
		}
	}

	public static void main(String[] args) {
		// printTriangle();
		//printSquare();
		printLeftTraingle();
	}

}
