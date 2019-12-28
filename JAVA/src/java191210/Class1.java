package java191210;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받아서
		// 1부터 입력 받은 숫자까지 2의 배수, 3의 배수를 제외한 총합 계산

		int i, num, sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();

		for (i = 1; i <= num; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("합계 : " + sum);

	}

}