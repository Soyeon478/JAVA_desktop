package java191205;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 시작값, 끝값을 입력받아 시작값 부터 끝값까지의 총합을 출력하는 프로그램을 작성하시오.
		 */

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int start = 0, and = 0;
		System.out.print("시작값을 입력하세요");
		start = scan.nextInt();
		System.out.print("끝값을 입력하세요");
		and = scan.nextInt();

		for (int i = start; i <= and; i++) {
			sum += i;
			System.out.print(i);
			if (i < and) {
				System.out.print("+");
			} else {
				System.out.println("=" + sum);
			}
		}
		System.out.println(start + "부터" + and + "까지의 합은" + sum + "입니다.");

	}

}