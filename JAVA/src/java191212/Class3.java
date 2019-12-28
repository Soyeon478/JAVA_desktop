package java191212;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		// 배열 new 연산자 이용하기
		
		Scanner scan = new Scanner(System.in);
		int number = 1;
		int[] num = null;
		// num[0] = 1;
		if (number == 1) {
			num = new int[3];
			System.out.println(num.length);
			System.out.println(num[0]);
		} else {
			System.out.println(num.length);
			System.out.println(num[0]);
		}
		scan.close();
	}

}