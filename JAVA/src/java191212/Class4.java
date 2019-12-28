package java191212;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// 배열에 정수 5개 입력받아서 가장 큰 수 출력

		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			num[i] = scan.nextInt();
			if (i == 0) {
				max = num[i];
			} else if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("큰 수는" + max + "입니다.");
		scan.close();
	}

}