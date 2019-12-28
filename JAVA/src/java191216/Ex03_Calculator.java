package java191216;

public class Ex03_Calculator {
	// 메소드 선언
	// 덧셈, 뺄셈, 나눗셈, 곱셈 메소드 각각 선언
	
	int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// return이 없다라고 할때 void를 사용 ***
	void  sum1(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("Calculator 클래스" + result);
	}
	
	
	
}