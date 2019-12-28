package java191213;

import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		// 거스름돈 구하기 문제

		Scanner sc = new Scanner(System.in);
		do {
			int[] coin = { 500, 100, 50, 10};
			System.out.print("금액  입력 : ");
			int change = sc.nextInt();
			for (int i = 0; i < coin.length; i++) {
				int coinCount = change / coin[i];
				System.out.println(coin[i] + "원 동전 : " + coinCount + "개");
				change = change % coin[i];
			}
		} while (true);
		
	}

}