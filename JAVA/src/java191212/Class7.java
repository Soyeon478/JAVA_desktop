package java191212;

public class Class7 {

	public static void main(String[] args) {
		// 향상된 for문(advanced for)(foreach문)
		int[] num = { 3, 4, 1, 2, 5 };

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// a가 순차적으로 출력
		for (int a : num) {
			System.out.println(a);
		}

		// 값이 5개 있는 String 배열을 선언하고 foreach를 이용하여
		// 배열에 담긴 모든 데이터 출력

		String[] FT = { "이홍기", "이재진", "송승현", "최민환", "박지훈" };
		for (String a : FT) {
			System.out.println(a);
		}

	}

}