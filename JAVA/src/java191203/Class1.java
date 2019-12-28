package java191203;

public class Class1 {

	public static void main(String[] args) {
		/*
		 * 변수 선언하고 값 대입해서 출력해보기 1. byte 타입 변수 1개 선언해서 값을 대입하고 출력 2. char 타입 변수 1개 선언해서
		 * 값을 대입하고 출력 3. long 타입 변수 1개 선언해서 값 대입하고 출력 4. double 타입 변수 1개 선언해서 값 대입하고 출력
		 * 5. float 타입 변수 1개 선언해서 값 대입하고 출력 6. boolean 타입 변수 1개 선언해서 값 대입하고 출력
		 */

		byte byteVariable;
		byteVariable = 127; // -128 ~ 127 값만 출력
		System.out.println(byteVariable);

		char chaVar;
		chaVar = 90; // 아스키코드 값으로 인식, 가장 나중에 들어온 값으로 출력(기존 값 덮어쓰기)
		chaVar = 'A';
		System.out.println(chaVar);

		long longVar;
		longVar = 10000000000L; // 숫자 마지막에 L을 붙여서 사용
		System.out.println(longVar);

		double doubleVar; // 실수를 위한 변수
		doubleVar = 100.0123;
		System.out.println(doubleVar);

		float floatVar;
		floatVar = 100.123f; // f를 적어서 float타입의 실수로 사용가능
		System.out.println(floatVar);

		boolean boolVar;
		boolVar = true; // true, false
		System.out.println(boolVar);

		/*
		 * 변수를 활용한 계산 1. 정수형 변수(number)를 선언하여 값을 대입하고 2. 그 변수에 10을 더한 결과를 또 다른
		 * 변수(result)에 대입하여 3. result 값 출력
		 */

		int number;
		number = 10;
		int result;
		result = number + 10;
		System.out.println(result);

		// 변수 선언은 중괄호 안에서 1번만 가능함
		int number1, result1;
		
		number1 = 1;
		System.out.println(number1);

		// 변수값을 초기화하면서 선언
		int number2 = 10000;
		System.out.println(number2);

		/*
		 * 정수형 변수 2개를 선언해서 +, -, *, /, % 연산을 각각 수행하고 결과를 출력하시오.
		 */

		int number3, number4, result2;
		number3 = 5;
		number4 = 3;
		result2 = number3 + number4;
		System.out.println("+결과 : " + result2);
		result2 = number3 - number4;
		System.out.println("-결과 : " + result2);
		result2 = number3 * number4;
		System.out.println("*결과 : " + result2);
		result2 = number3 / number4;
		System.out.println("/결과 : " + result2);
		result2 = number3 % number4;
		System.out.println("%결과 : " + result2);

		// print는 한줄로 결과 값이 나오고 println은 결과값이 한줄씩 나온다

		// String 타입 변수
		String stringVar;
		stringVar = "변수에 저장하고 싶은 내용";
		System.out.println(stringVar);

		String strVar1 = "자바";
		String strVar2 = "아직은 할만해";
		String strVar3 = "난 틀렸어";
		String result3;
		result3 = strVar1 + strVar2;
		System.out.println(result3);
		result3 = strVar1 + strVar3;
		System.out.println(result3);
		result3 = result3 + strVar3;
		System.out.println(result3);
		result3 = strVar1 + 8.0;
		System.out.println(result3);
	}

}