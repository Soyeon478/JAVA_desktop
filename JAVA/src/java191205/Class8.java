package java191205;

import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
//		int num1, num2;
//		String result;
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		num1 = scan.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		num2 = scan.nextInt();
//		if (num1 > num2) {
//			result = num1 + "이 큽니다.";
//		} else {
//			result = num2 + "이 큽니다.";
//		}
//		System.out.print(result);

		int num1, num2;
		String result;
		System.out.println("첫번째 숫자를 입력하세요 : ");
		num1=scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		num2=scan.nextInt();
		if (num1>num2) {
			result = num1 + "이 큽니다.";
		} else {
			result = num2 + "이 큽니다.";
		}
		System.out.println(result);
		
		
	}

}
