package java191206;

public class Class3 {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력

		int result = 0;
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.print(i + "X" + j + "=" + result + "\t");
			}
			System.out.println("");
		}

	}

}