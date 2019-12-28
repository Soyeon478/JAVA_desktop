package java191220;

import java.util.List;

public class Student {
	/* 1. 학생등록
	 * - 학생정보를 입력하세요
	 * - 이름(name) : 
	 * - 생년월일(birth) : 
	 * - 주소(address) : 
	 * - 전화번호(phone) : 
	 * 2. 과목별 점수입력
	 * - 과목별 성적을 입력하세요
	 * - 학생이름을 입력하세요
	 * - java 점수 : 
	 * - servlet 점수 : 
	 * - spring 점수 : 
	 * 3. 점수리스트
	 * 4. 과목별 최고점수
	 * - 과목을 선택하세요
	 * - 1.java | 2.servlet | 3.spring
	 * 5. 종료
	 */
	
	// 학생등록 필드선언
	private int studentNumber;
	private String name;
	private String birth;
	private	String address;
	private String phone;
	
	// 점수 필드선언
	private int javascore;
	private int servletscore;
	private int springscore;
	
	private Major major;
		
	// 학생등록 메소드 생성자
	public Student(int studentNumber, String name, String birth, String address, String phone) {
	this.studentNumber = studentNumber;
	this.name = name;
	this.birth = birth;
	this.address = address;
	this.phone = phone;
	}
	
	// 점수 메소드 생성자
	public Student(int javascore, int servletscore, int springscore) {
	this.javascore = javascore;
	this.servletscore = servletscore;
	this.springscore = springscore;
	}

	// 기본 생성자
	public Student() {
		
	}
	
	// get, set 메소드
	public int getstudentNumber() {
		return studentNumber;
	}

	public void setstudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// get, set 메소드
	public int getjavascore() {
		return javascore;
	}

	public void setjavascore(int javascore) {
		this.javascore = javascore;
	}

	public int getservletscore() {
		return servletscore;
	}

	public void setservletscore(int servletscore) {
		this.servletscore = servletscore;
	}

	public int getspringscore() {
		return springscore;
	}

	public void setspringscore(int springscore) {
		this.springscore = springscore;
	}
	
	public void studentscore(int javascore, int servletscore, int springscore) {
		this.javascore = javascore;
		this.servletscore = servletscore;
		this.springscore = springscore;
	}
	
	
	public void javaMax(List<Student> studentList) {
		int max = 0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(max).getjavascore() < studentList.get(i).getjavascore()) {
				max = i;
			}
		}
		System.out.println("java 최고점수는 " + studentList.get(max).getName() + "의 " + studentList.get(max).getjavascore() + "점 입니다.");
	}
	
	public void servletMax(List<Student> studentList) {
		int max = 0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(max).getservletscore() < studentList.get(i).getservletscore()) {
				max = i;
			}
		}
		System.out.println("servlet 최고점수는 " + studentList.get(max).getName() + "의 " + studentList.get(max).getservletscore() + "점 입니다.");
	}
	
	public void springMax(List<Student> studentList) {
		int max = 0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(max).getspringscore() < studentList.get(i).getspringscore()) {
				max = i;
			}
		}
		System.out.println("spring 최고점수는 " + studentList.get(max).getName() + "의 " + studentList.get(max).getspringscore() + "점 입니다.");
	}
	
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + ", birth=" + birth + ", address="
				+ address + ", phone=" + phone + ", javascore=" + javascore + ", servletscore=" + servletscore + ", springscore=" + springscore
				+ "]";
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

}
