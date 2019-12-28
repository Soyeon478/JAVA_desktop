package java191213;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// 2차원 배열을 이용한 단어 퀴즈

		Scanner scan = new Scanner(System.in);
		String[][] words = {
						   { "apple", "사과" },
						   { "banana", "바나나" },
						   { "grape", "포도" },
						   { "kiwi", "키위" },
						   { "orange", "오렌지" }
						   };
		int score = 0;
		for (int i = 0; i < words.length; i++) {
			System.out.print("문제" + (i + 1) + "." + words[i][0] + "의 뜻은 무엇인가요? ");
			String input = scan.nextLine();
			if (input.equals(words[i][1])) {
				System.out.println("정답 입니다.");
				score++;
			} else {
				System.out.println("틀렸습니다.\n" + "정답 :" + words[i][1] + "입니다.");
			}
		}
		System.out.println("총 " + score + "개 정답입니다.");
		double percent = 100*((double)score/words.length);
		System.out.println("정답률은 " + percent + "% 입니다.");
		scan.close();
	}

}