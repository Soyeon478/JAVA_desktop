package java191204;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		// 스캐너를 사용하기 위해 스캐너 객체 선언
		Scanner scan = new Scanner(System.in); // (scan을 변경해서 사용/Scanner을 scan이라고 부르겠다)
		// Scanner sc = new Scanner(System.in);
		// Scanner scanner = new Scanner(System.in);
		String name, address;
		int age;
		System.out.print("이름을 입력하세요 : "); // (콘솔창에서 입력한 값을 name에 저장)
		name = scan.next(); // (next : 문자입력을 받아 주는 역할)
		
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt(); // (nextInt : 정수입력을 받아주는 역할, 글자는 안됨)
		
		System.out.print("주소를 입력하세요 : ");
		address = scan.next();
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + address);
	}

}