package java191212;

import java.util.Arrays;
import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		// 배열에 정수 5개 입력받아서 오름차순으로 정렬

		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			num[i] = scan.nextInt();
		}
		Arrays.parallelSort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

//		// 오름 차순 정렬
//		// 0,1 0,2 0,3 0,4
//		// 1,2 1,3 1,4
//		// 2,3 2,4
//		// 3,4
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				// 순서 바꾸기(버블정렬)
//				if (num[i] > num[j]) {
//					temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}

		scan.close();
	}

}