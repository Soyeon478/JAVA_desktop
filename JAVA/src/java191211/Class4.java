package java191211;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while (run) {
		System.out.println("-----------------------------------------");
		System.out.println("1.예금 |" + " 2.출금 |" + " 3.잔고 |" + " 4.종료");
		System.out.println("-----------------------------------------");
		System.out.print("선택> ");
		
		int menuNum = scan.nextInt();
		
		switch (menuNum) {
		case 1 :
			System.out.print("예금액>");
			int deposit = scan.nextInt();
			balance += deposit;
			System.out.println("현재잔액은" + balance + "입니다.");
			break;
		case 2 :
			System.out.print("출금액>");
			int withdraw = scan.nextInt();
			balance -= withdraw;
			if (balance < 0) {
				System.out.println("잔고가 부족합니다.");
				balance = balance + withdraw;
			System.out.println("현재잔액은" + balance + "입니다.");
			} else {
				System.out.println("출금처리가 되었습니다.");
				System.out.println("현재잔액은" + balance + "입니다.");
			}
			break;
		case 3 :
			System.out.println("잔고>");
			System.out.println("현재 잔액은" + balance + "입니다.");
			break;
		case 4 :
			run = false;
			System.out.println("종료 합니다.");
		}
		}
		scan.close();
		
		
	}

}