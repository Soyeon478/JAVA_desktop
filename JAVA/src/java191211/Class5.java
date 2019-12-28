package java191211;

public class Class5 {

	public static void main(String[] args) {
		// 배열(Array) : 같은 타입의 데이터를 하나의 변수에 저장하는 구조
		// 배열 선언
		// 타입[] 배열이름 or 타입 배열이름[]
		// 배열 선언
		int[] number;
		int number1[];
		
		// 배열을 선언하면서 값을 주기 (일차원 배열)
		int[] number2 = { 1, 2, 3 };
		
		// number2 배열의 첫번째 칸에 저장된 값 출력 (배열은 0번부터 시작)
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);

		String[] name = { "박소연", "임선영", "박누리" };
		System.out.println(name[0]);

		// for문을 이용해서 name 배열에 저장된 값을 모두 출력해보세요
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// 정수형 배열 변수를 하나 선언해서 값을 4개 저장하고
		// 배열변수에 저장된 모든 값의 총합과 평균을 출력하세요.
		int[] num = { 5, 12, 23, 37 }; // index([]) : 3, length(크기) : 4
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / num.length);

		// 배열 선언하면서 크기만 지정하기
		int[] num1 = new int[3];
		System.out.println(num1.length);
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
	//	System.out.println(num1[3]); // index가 3까지만 있기때문에 값이 나오지 않음
		num1[0] = 5;
		num1[1] = 7;
		num1[2] = 100;
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
	}

}