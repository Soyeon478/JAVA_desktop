package java191202;

public class Exerxise1 {

	public static void main(String[] args) {
		// Hello world 출력
		System.out.println("Hello World!!"); //Run-Run As-Java-Application-ok
		System.out.println("Park so yeon");
		System.out.println("Island");
		System.out.println("madonna");
		System.out.println("Enter");
	/*  
	 	*변수(Variable) [숫자변수(정수,실수), 문자변수(단일,문장), 논리변수]
	 
		-어떤 값을 저장하기 위해 사용하는 것
		1. 변수 선언 - 타입(입력) 변수이름
		2. 변수 값 대입 - 변수이름 = 값;
	 		*A=10 : 우변을 좌변에 대입
		3. 변수 사용
		-타입(type)
		
	 	*상수(Constant)
	 	-파이
	*/

	/*
		number 라는 정수형 변수를 선언해서
		number에 10을 대입하고
		number에 저장된 값을 출력하기
	*/

		//변수선언(타입 변수명)
		int number;
		//int=정수형 변수
		//number에 10 대입
		number = 100;
		//number 값 출력
		System.out.println("number변수값 : " + number);
		
	/*  변수이름 규칙
		int 123; (숫자 이름으로 된 변수는 안됨)
		int 1number; (숫자로 시작하는 변수도 안됨)
		int number1; (문자로 시작해서 뒤에 숫자가 붙는건 가능)
		int _number; (언더바 사용 가능)
		int $number; ($ 사용 가능)
		int %number; (안됨)
		int &number; (안됨)
		int a; (의미없이 a,b,c 변수이름 사용 안하는게 좋음)
		
		*변수이름은 되도록이면 소문자로 사용
		변수이름 fristname, lastname
		
		*두번째 단어는 대문자로 시작(네이밍 룰)
		int firstName;
		int lastName;
		
		
		*예약어
		int int; (변수로 못씀)
		 
	*/
	
	/*
		*변수타입
		1.정수형 변수
		  int(가장 많이 사용) : 4byte = 32bit
		  byte : 1byte
		  short : 2byte
		  long : 8byte
		  char : 2byte
		2.실수형 변수
		  float : 4byte
		  double : 8byte
		3.논리형 변수
		  boolean (true, false) / 딱 두타입만 사용
		4.문자열 변수
		  string
	 */
		
		int number2;
		number2 = 1000000000;
		System.out.println(number2);
	}

}