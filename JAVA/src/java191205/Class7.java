package java191205;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3, max;
		System.out.print("1번 숫자를 입력하시오");
		num1 = scan.nextInt();
		System.out.print("2번 숫자를 입력하시오");
		num2 = scan.nextInt();
		System.out.print("3번 숫자를 입력하시오");
		num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("큰수는" + max + "입니다.");
	}

}
