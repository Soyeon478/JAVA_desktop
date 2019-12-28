package java191216;

public class Ex04_Calculator {

	void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("덧셈 결과 " + result);
	}

	void subtract(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("뺄셈 결과 " + result);
	}

	void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("곱셈 결과 " + result);
	}

	void divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("나눗셈 결과 " + result);
	}

}