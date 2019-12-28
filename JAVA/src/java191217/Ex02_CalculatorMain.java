package java191217;

import java.util.Scanner;

public class Ex02_CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex02_Calculator cal = new Ex02_Calculator();
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
			if(choice == 1) {
				int sumResult = cal.sum(num1, num2);
				System.out.println("덧셈 결과 : " + sumResult);
			} else if(choice == 2) {
				int subtractResult = cal.subtract(num1, num2);
				System.out.println("뺄셈 결과 : " + subtractResult);
			} else if (choice == 3) {
				int multiplyResult = cal.multiply(num1, num2);
				System.out.println("곱셈 결과 : " + multiplyResult);
			} else if(choice == 4) {
				int divideResult = cal.divide(num1, num2);
				System.out.println("나눗셈 결과 : " + divideResult);
			}
		}
		sc.close();
	}

}