package java191213;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		// 학생 관리 프로그램

		Scanner sc = new Scanner(System.in);
		int a = 0, num = 0, score = 0, sum = 0, max = 0, avg = 0;
		int[] student = null;
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			a = sc.nextInt();
			if (a == 1) {
				System.out.print("학생수> ");
				num = sc.nextInt();
				student = new int[num];
			} else if (a == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "번째 학생 점수 : ");
					score = sc.nextInt();
					student[i] = score;
					sum += score;
				}
			} else if (a == 3) {
				for (int i = 0; i < student.length; i++)
					System.out.println((i + 1) + "번째 학생 점수 : " + student[i]);
			} else if (a == 4) {
				for (int i = 0; i < student.length; i++) {
					if (i == 0) {
						max = student[i];
					}
					if (student[i] > max) {
						max = student[i];
					}
					avg = sum / student.length;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				for (int i = 0; i < student.length; i++) {
					for (int j = i + 1; j < student.length; j++) {
						int temp = 0;
						if (student[i] < student[j]) {
							temp = student[i];
							student[i] = student[j];
							student[j] = temp;
						}
					}
				}
				for (int i = 0; i < student.length; i++) {
					System.out.println(student[i]);
				}
			} else if (a == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}