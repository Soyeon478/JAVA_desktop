package java191216;

public class Ex02_Student {
	// 교육원에 다니는 훈련생에 대한 클래스를 만들고
	// 메인 클래스에서 각자 같은 줄에 앉은 사람들에 대한 객체를 각각 선언해서 필드값 출력
	// 이름(name), 나이(age), 주소(address), 연락처(mobile)
	String name, address, mobile;
	int age;
	Ex02_Student(String name, int age, String address, String mobile){
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", mobile=" + mobile + ", age=" + age + "]";
	}
	
	Ex02_Student() {
		
	}
	
}