package java191212;

public class Class1 {

	public static void main(String[] args) {
		// 크기가 5인 double 타입의 배열 변수 선언
		// 각각 값을 저장해보고 for문을 이용하려 저장된 값 출력

		double[] num = { 2.18, 5.54, 11.7, 33.4, 74.9 };
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		double[] num1 = new double[5];
		num1[0] = 1.111;
		num1[1] = 2.222;
		num1[2] = 3.333;
		num1[3] = 4.444;
		num1[4] = 5.555;
		for (int j = 0; j < num1.length; j++) {
			System.out.println(num1[j]);
		}

	}

}