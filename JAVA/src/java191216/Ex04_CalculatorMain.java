package java191216;

import java.util.Scanner;

public class Ex04_CalculatorMain {

	public static void main(String[] args) {
		// 객체지향 계산기

		Scanner sc = new Scanner(System.in);
		Ex04_Calculator cal = new Ex04_Calculator();
		int num1, num2;
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("종료");
				break;
			}
			System.out.print("숫자 입력 : ");
			num1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			num2 = sc.nextInt();
			if (choice == 1) {
				cal.sum(num1, num2);
			} else if (choice == 2) {
				cal.subtract(num1, num2);
			} else if (choice == 3) {
				cal.multiply(num1, num2);
			} else if (choice == 4) {
				cal.divide(num1, num2);
			}
		}
		sc.close();

	}

}