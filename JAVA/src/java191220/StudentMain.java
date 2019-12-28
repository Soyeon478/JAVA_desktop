package java191220;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Student> studentList = new ArrayList<Student>();
		Student student = null;
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생등록 | " + "2.과목별 점수입력 | " + "3.점수리스트 | " + "4.과목별 최고점수 | " + "5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				student = new Student();
				int studentNumber = studentList.size() + 1;
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("생년월일 : ");
				String birth = sc.next();
				System.out.print("주소 : ");
				String address = sc.next();
				System.out.print("전화번호 : ");
				String phone = sc.next();
				System.out.println("학과 : 1.컴퓨터 2.전자 3.정보통신 4.경영");
				int major = sc.nextInt();
				// 매개변수가 있는 생성자 호출을 통한 객체 생성
				student = new Student(studentNumber, name, birth, address, phone);
				if (major == 1) {
					// major 필드에 컴퓨터공학 저장
					student.setMajor(Major.컴퓨터공학);
				} else if (major == 2) {
					// major 필드에 전자공학 저장
					student.setMajor(Major.전자공학);
				}
				studentList.add(student);
				break;
			case 2:
				System.out.println("과목별 성적을 입력하세요");
				System.out.println("학생 이름을 입력하세요");
				name = sc.next();
				for (int i = 0; i < studentList.size(); i++) {
					if (studentList.get(i).getName().equals(name)) {
						System.out.print("java 점수 : ");
						int javascore = sc.nextInt();
						System.out.print("servlet 점수 : ");
						int servletscore = sc.nextInt();
						System.out.print("springscore 점수 : ");
						int springscore = sc.nextInt();
						studentList.get(i).studentscore(javascore, servletscore, springscore);
					}
				}
				break;
			case 3:
				for (int i = 0; i < studentList.size(); i++) {
					System.out.println(studentList.get(i).toString());
				}
				break;
			case 4:
				System.out.println("과목을 선택하세요");
				System.out.println("1.java | " + "2.servlet | " + "3.spring");
				int choice = sc.nextInt();
				if (choice == 1) {
					student.javaMax(studentList);
				} else if (choice == 2) {
					student.servletMax(studentList);
				} else if (choice == 3) {
					student.springMax(studentList);
				}
				break;
			case 5:
				System.out.println("종료");
				run = false;
				break;
			default:
				break;
			}
		}

	}

}
