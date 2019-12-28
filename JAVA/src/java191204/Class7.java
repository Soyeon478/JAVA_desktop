package java191204;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		// random 메소드
		// 특정 범위 내에서 숫자 하나를 출력해주는 메소드
		// 1~10 사이의 숫자 하나를 무작위로 발생
		// (int)(Math.random() * 10) + 1
		// Math.random() : 0보다 크거나 같고 1.0보다 작은 숫자(0<=Math.random<1.0)
		// int는 실수를 정수로 바꾸기 위해 사용
		
		
		// 1~6 숫자를 랜덤 발생
		Scanner scan= new Scanner(System.in);
		int num1 = (int)Math.random()*6+1;
		
		if(num1==1) {
			System.out.println("1이 나왔습니다.");
		} else if(num1==2) {
			System.out.println("2가 나왔습니다.");
		} else if(num1==3) {
			System.out.println("3가 나왔습니다.");
		} else if(num1==4) {
			System.out.println("4가 나왔습니다.");
		} else if(num1==5) {
			System.out.println("5가 나왔습니다.");
		} else {
			System.out.println("6이 나왔습니다.");
		}
	}

}