package java191217;

public class Ex01_Car1Main {

	public static void main(String[] args) {

		Ex01_Car1 car = new Ex01_Car1();
		car.setGas(5);
		boolean gasState = car.isleftGas();
		System.out.println(car.gas);
		if (gasState) {
			System.out.println("출발");
			car.run();
		}
		
		/* 1. Car클래스
		 * 2. setGas 메소드 출력
		 * 3. 필드값 5 세팅
		 * 4. car.isleftGas() 메소드 출력
		 * 5. gas값 5 이므로 gas가 있습니다. 출력
		 * 6. car.isleftGas()값 5 출력
		 * 7. gasState 출발 출력
		 * 8. run true 출력 -> 0이되면 return
		 */
		
	}
}