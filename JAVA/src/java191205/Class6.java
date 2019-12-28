package java191205;

import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 합격 불합격 출력 프로그램 1. 입력값 : 학년, 점수 2. 조건 1~3학년은 점수가 60점 이상이어야 "합격입니다." 출력 4학년은
		 * 70점 이상이어야 "합격입니다." 출력
		 */

		Scanner scan = new Scanner(System.in);
		int number = 0, score = 0;
		String gread = null;
		System.out.print("학년을 입력해 주세요 : ");
		number = scan.nextInt();
		System.out.print("점수를 입력해 주세요 : ");
		score = scan.nextInt();

		if (score >= 60) {
			if (number != 4) {
				System.out.println("합격입니다.");
			} else if (score >= 70) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격 입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
		}
		
		

//		if (number >= 1 && number < 4) {
//			if (number >= 1 && number <= 3) {
//				if (score >= 60) {
//					System.out.println("합격 입니다.");
//				} else {
//					System.out.println("불합격 입니다.");
//				}
//			} else if (number == 4) {
//			}
//			if (score >= 70) {
//				System.out.println("합격 입니다.");
//			} else {
//				System.out.println("불합격 입니다.");
//			}
//		}

	}

}