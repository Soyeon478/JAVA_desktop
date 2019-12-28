package java191211;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {

		// 제어문을 이용한 은행 프로그램
		// 주요 기능은 입금, 출금, 잔고확인, 종료 기능

		Scanner scan = new Scanner(System.in);
		int num, in, out, sum = 0;
		boolean run = true;
		System.out.println("-----------------------------------------");
		System.out.println("1.예금 |" + " 2.출금 |" + " 3.잔고 |" + " 4.종료");
		System.out.println("-----------------------------------------");
		
		while (run) {
			System.out.print("선택> ");
			num = scan.nextInt();
			if (num == 4) {
				System.out.println("프로그램이 종료 되었습니다.");
				run = false;
			} else if (num == 1) {
				System.out.print("예금액> ");
				in = scan.nextInt();
				sum += in;
				System.out.println("현재 잔액은 " + sum + "원 입니다.");
			} else if (num == 2) {
				System.out.print("출금액> ");
				out = scan.nextInt();
				if (out < sum) {
					sum -= out;
					System.out.println("출금처리가 되었습니다.");
					System.out.println("현재 잔액은 " + sum + "원 입니다.");
				} else if (out > sum) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은" + sum + "원 입니다.");
				}
			} else {
				System.out.println("잔고>현재 잔액은 " + sum + "원 입니다.");
			}
		}
		scan.close();

	}

}