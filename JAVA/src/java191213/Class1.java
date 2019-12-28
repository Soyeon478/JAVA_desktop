package java191213;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// 스캐너로 원하는 배열 크기 입력, 그 크기를 갖는 배열 만들기

		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		int result = scan.nextInt();
		int[]num = new int[result];
		System.out.println(num.length);
		
		scan.close();
	}

}