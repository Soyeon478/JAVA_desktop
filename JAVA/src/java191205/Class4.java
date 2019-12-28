package java191205;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for를 이용하여 1부터 10까지 합 출력
		
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//		System.out.println("반복 변수 i값 : " + i);
//		sum = sum + i;
//		}
//		System.out.println("1부터 10까지 합한 i값 : " + sum);
		
		
		//for를 이용하여 1부터 10까지 누적 합 출력
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
				sum += i;
				System.out.print(i);
				if(i<=9) {
					System.out.print("+");
				} else {
					System.out.print("=");
					System.out.print(sum);
				}
			}
		

		
//		
//		for(int i=1;i<=10;i++) {
//			System.out.print(i);
//			sum = sum + i;
//			if(sum<55) {
//				System.out.print("+");
//			}
////		}
//			System.out.print("=" + sum);
		
	}

}