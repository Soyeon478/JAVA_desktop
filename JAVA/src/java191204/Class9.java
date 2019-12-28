package java191204;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		//초를 입력하세요 : 5500
		//5500초는 1시간 31분 40초 입니다.
		//초를 입력하세요 : 3600
		//3600초는 1시간 0분 0초 입니다.
		//초를 입력하세요 : 2000
		//2000초는 0시간 33분 20초 입니다.
		//초를 입력하세요 : 100
		//100초는 0시간 1분 40초 입니다.
		
		Scanner scan = new Scanner(System.in);
		
		int num1, result1, result2, result3;
		System.out.print("초를 입력하세요 : ");
		num1 = scan.nextInt();
		result1 = (num1%3600)%60;
		result2 = (num1%3600)/60;
		result3 = num1/3600;
		
		System.out.println(num1 + "초는 " + result3 + "시간 " + result2 + "분 " + result1 + "초 입니다.");
	}

}