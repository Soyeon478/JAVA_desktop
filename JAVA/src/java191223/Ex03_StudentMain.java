package java191223;

public class Ex03_StudentMain {

	public static void main(String[] args) {
		
		Ex03_Student sd = new Ex03_Student("이홍기", "900302-1111111", 1, "실용음악과");
		
		// 필드값 출력
		System.out.println(sd.name);
		System.out.println(sd.peopleNumber);
		System.out.println(sd.studentNumber);
		System.out.println(sd.major);
		
		
	}

}
