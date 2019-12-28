package java191217;

public class Ex04_CalculatorMain {

	public static void main(String[] args) {
		Ex04_Calculator cal = new Ex04_Calculator();
		// 필드값 호출
		System.out.println(cal.pi1);
		System.out.println(cal.pi);
		System.out.println(Ex04_Calculator.pi); // static 필드값 호출
		
		// 메소드 호출
		System.out.println(cal.add(5, 5));
		System.out.println(cal.subtract(5, 5));
		System.out.println(Ex04_Calculator.pi); // static 메소드  호출
		
		System.out.println(cal.EARTTH_RADIUS);
		System.out.println(Ex04_Calculator.EARTTH_RADIUS); // static 메소드  호출
		
	}

}
