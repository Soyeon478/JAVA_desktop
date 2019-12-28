package java191213;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		// 학점 계산하기
		/*
		 * 스캐너를 이용하여 4년간의 학기별 학점을 입력하고 총 평점을 출력하세요
		 */

		Scanner scan = new Scanner(System.in);
		double[][] scores = new double[4][2];
		int sum = 0;
		int count = 0;
		System.out.println("성적을 입력하세요");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((i+1)+"학년"+(j+1)+"학기 : ");
				scores[i][j] = scan.nextDouble();
				sum = (int) (sum + scores[i][j]);
				count++;
			}
		} 
		double avg = sum/(scores.length*scores[0].length);
		avg = (double)sum/count;
		System.out.println(sum);
		System.out.println(avg);
		scan.close();
	}

}