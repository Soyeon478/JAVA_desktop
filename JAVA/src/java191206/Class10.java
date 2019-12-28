package java191206;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int result;
		while (run) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			result = num1 + num2;
			if (result == 5) {
				System.out.println(result + "가 나왔네요 종료합니다.");
				run = false;
			} else {
				System.out.println(num1 + "+" + num2 + "=" + result);
			}
		}

	}

}