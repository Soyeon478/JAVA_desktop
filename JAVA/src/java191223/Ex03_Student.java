package java191223;

public class Ex03_Student extends Ex03_People {
	
	int studentNumber;
	String major;
	
	Ex03_Student(String name, String peopleNumber) {
		// super : 부모 클래스의 생성자
		super(name, peopleNumber);
	}
	
	Ex03_Student(String name, String peopleNumber, int studentNumber, String major){
		super(name, peopleNumber);
//		this.name = name;
//		this.peopleNumber = peopleNumber;
		this.studentNumber = studentNumber;
		this.major = major;
	}

}
