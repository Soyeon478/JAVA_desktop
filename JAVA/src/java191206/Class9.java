package java191206;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		// 숫자 6이 나오면 종료
		// 숫자 :
		// 6이 나왔네요 종료합니다.

		Scanner scan = new Scanner(System.in);
		boolean run = true;

		while (run) {
			int num1 = (int) (Math.random() * 6) + 1;
			if (num1 == 6) {
				System.out.println(num1 + "이 나왔네요 종료합니다.");
				run = false;
			} else {
				System.out.println("숫자 : " + num1);
			}
		}

	}

}
