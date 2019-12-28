package java191206;

public class Class7 {

	public static void main(String[] args) {

		// 1~10까지 합과 식을 출력

		int sum = 0, i = 1;
//		while (i <= 10) {
//			sum += i;
//			System.out.print(i);
//			if (i <= 9) {
//				System.out.print("+");
//			} else {
//				System.out.print("=" + sum);
//			}
//			i++;
//		}

		while (i <= 10) {
			sum += i;
			if (i < 10) {
				System.out.print(i + "+");
			} else {
				System.out.println(i + "=" + sum);
			} i++;
		}

	}

}