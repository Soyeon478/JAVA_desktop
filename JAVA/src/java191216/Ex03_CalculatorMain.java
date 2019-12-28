package java191216;

public class Ex03_CalculatorMain {

	public static void main(String[] args) {
		// Calculator 클래스의 객체 생성
		Ex03_Calculator cal = new Ex03_Calculator();
		int sumResult = cal.sum(3, 5);
		// int sumResult = 10;
		System.out.println(sumResult);
		System.out.println(cal.sum(3, 5));
		
		cal.sum1(3, 5, 7);
		
		
		
	}

}
