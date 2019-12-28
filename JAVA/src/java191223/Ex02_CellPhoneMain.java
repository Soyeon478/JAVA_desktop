package java191223;

public class Ex02_CellPhoneMain {

	public static void main(String[] args) {
		/*
		 * CellPhone 클래스 객체 선언해서
		 * - 부모클래스 필드값 출력
		 * - 부모클래스 메소드 호출
		 * - 자식클래스 필드값 출력
		 * - 자식클래스 메소드 호출
		 */
		
		Ex02_CellPhone cell = new Ex02_CellPhone("버튼", "아이폰", "화이트");
		
		// 필드값 출력
		System.out.println(cell.button);
		System.out.println(cell.model);
		System.out.println(cell.color);
		System.out.println(cell.message);
		
		// 부모 클래스 메소드 호출
		cell.call("여보세요");
		cell.hangOn();
		cell.hangOff();
		
		// 자식 클래스 메소드 호출
		cell.powerOn();
		cell.powerOff();
		cell.sendMessage("곧 점심시간");
		cell.receiveMessage("냐냐냐");
		
	}

}
