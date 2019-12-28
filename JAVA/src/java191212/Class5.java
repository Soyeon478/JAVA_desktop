package java191212;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// 배열에 정수 5개 입력받아서 오름차순으로 정렬
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			num[i] = scan.nextInt();
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		scan.close();
	}

}