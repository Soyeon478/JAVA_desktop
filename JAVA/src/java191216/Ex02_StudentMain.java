package java191216;

public class Ex02_StudentMain {

	public static void main(String[] args) {
		Ex02_Student stu1 = new Ex02_Student("원선영", 27, "인천 서구", "010-0000-0000");
		Ex02_Student stu2 = new Ex02_Student("박누리", 28, "인천 남동구", "010-0000-0000");
		Ex02_Student stu3 = new Ex02_Student("손예담", 22, "부천 소사구", "010-0000-0000");
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.toString());
		
		Ex02_Student stu = new Ex02_Student(); // 생성자가 선언 되있으면 기본 생성자를 사용 할 수  없고, 기본 생성자를 만들어 주면 사용 가능. 
		
		
	}

}