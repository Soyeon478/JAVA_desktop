package java191213;

public class Class5 {

	public static void main(String[] args) {
		/*
		 * 형변환
		 * 특정 타입의 변수가 다른 타입의 변수로 변환되는 것
		 * 1. 자동형변환(Promotion)
		 * 	    크기가 작은 타입의 큰 타입으로 변환
		 * 2. 강제형변환(Casting)
		 * 	    크기가 큰 타입을 작은 타입으로 변환
		 */
		
		byte byteValue = 10;
		int intValue = 10;
		double doubleValue = 1.0;
		
		intValue = byteValue; // 자동형변환
		byteValue = (byte) intValue; //강제형변환
		intValue = (int) doubleValue; //강제형변환
		
	}

}
