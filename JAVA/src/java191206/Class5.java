package java191206;

public class Class5 {

	public static void main(String[] args) {

		// while 문 (무한반복문 작성할때 많이 사용)
		// 반복조건은 bool타입으로 나오는 것만 사용 가능
		// while(반복조건) {
		// 반복실행내용
		// }

		// while문을 이용하여 1~10까지 출력하기
		// 반복 실행을 위한 반복변수 선언

//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("while문 종료");

		int i = 1;
		boolean run = true;
		while (run) {

			System.out.println(i);
			i++;
			if (i == 100)
				run = false;
		}
		System.out.println("while문 종료");
		System.out.println(i);

	}

}