package FlowControl;

public class NumberSystem {
	static boolean IsPrimeNumber(int a) {

		for (int n = 2; n <= a - 1; n++) {
			if (a % n == 0)
				return false;
		}
		return a<=1?false:true;
	}

	public static void main(String[] args) {
		boolean result = IsPrimeNumber (3);
		System.out.println(result);
	}

}
