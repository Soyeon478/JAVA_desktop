package java191211;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ranNum, num, count = 0;
		boolean run = true;
		ranNum = (int) (Math.random() * 100);

		while (run) {
			count++;
			System.out.print("1부터 100까지의 숫자를 입력 하세요 : ");
			num = scan.nextInt();
			if (num <= 0 || num >= 100) {
			} else if (num > ranNum) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (num < ranNum) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				run = false;
			}
		}
		scan.close();

	}

}