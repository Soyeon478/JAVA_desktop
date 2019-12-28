package java191206;

import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {

		// 메시지를 입력 하세요
		// 프로그램을 종료하려면 '종료'를 입력하세요

		Scanner scan = new Scanner(System.in);
		String a = "";
		boolean run = true;

		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
		
		while (run) {
			System.out.print(">");
			a = scan.next();
			if (a.equals("종료")) {
				System.out.println("종료 되었습니다.");
				run = false;
			} else {
				System.out.println(a);
			}
		}

	}

}