package java191206;

public class Class4 {

	public static void main(String[] args) {
		// 별찍기

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
				if (a == b) {
					System.out.println();
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}