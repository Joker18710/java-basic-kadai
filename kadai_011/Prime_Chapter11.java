package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] arge) {

		for (int i = 2; i < 101; i++) {
			boolean primeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primeNumber = false;
					break;
				}
			}

			if (primeNumber) {
				System.out.println(i);
			}
		}
	}
}
