package java191205;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		String word = null;
		word = scan.next();
		switch(word) {
		case "desk" : 
			System.out.println("책상 입니다.");
			break;
		case "chair" : 
			System.out.println("의자 입니다.");
			break;
		case "monitor" : 
			System.out.println("모니터 입니다.");
			break;
		case "mouse" : 
			System.out.println("마우스 입니다.");
			break;
		default : 
			System.out.println("사전에 없는 단어 입니다.");
			break;
		}
		
	}

}