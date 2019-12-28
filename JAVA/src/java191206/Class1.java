package java191206;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// 1부터 100까지 숫자중에서 3의 배수 출력하기
		// 3의 배수 조건 : 3으로 나눴을 때 나머지가 0인 숫자

		int num = 0, i;
		for (i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
		}

	}

}