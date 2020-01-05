package javadb191230;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {

		List<Member> memberList = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		Membersql sql = new Membersql();
		Member member = null;

		boolean run = true;

		while (run) {
			System.out.println("0.DB접속 | 1.회원가입 | 2.회원정보 수정 | 3.회원탈퇴 | 4.관리자 | 5.종료");
			int selectNum = sc.nextInt();
			switch (selectNum) {
			case 0:
				sql.dbConnection();
				break;
			case 1:
				member = new Member();
				
				System.out.print("아이디");
				String id = sc.next();
				member.setId(id);

				System.out.print("비밀번호");
				String password = sc.next();
				member.setPassword(password);

				System.out.print("이름");
				String name = sc.next();
				member.setName(name);

				System.out.print("생일(YYYYMMDD)");
				String birth = sc.next();
				member.setBirth(birth);

				System.out.print("이메일");
				String email = sc.next();
				member.setEmail(email);

				System.out.print("전화번호");
				String phone = sc.next();
				member.setPhone(phone);

				sql.memberJoin(member);
				break;
			case 2:
				System.out.print("아이디");
				id = sc.next();

				System.out.print("비밀번호");
				password = sc.next();

				boolean checkResult = sql.idCheck(id, password);
				
				if (checkResult) {
					System.out.print("변경할 전화번호 입력");
					phone = sc.next();
					sql.memberModify(id, phone);
				} else
					System.out.println("아이디 또는 비번이 틀립니다!!");
				break;
			case 3:
				System.out.print("아이디 : ");
				id = sc.next();

				System.out.print("비밀번호 : ");
				password = sc.next();

				checkResult = sql.idCheck(id, password);

				if (checkResult) {
					System.out.print("비밀번호 한번 더 입력 : ");
					password = sc.next();
					sql.deleteMember(password);
				} else
					System.out.println("아이디 또는 비번이 틀립니다!!");
				break;
			case 4:
				System.out.print("아이디");
				id = sc.next();

				System.out.print("비밀번호");
				password = sc.next();

				checkResult = sql.idCheck(id, password);
				if (checkResult) {
					sql.memberList();
				} else
					System.out.println("관리자가 아닙니다!!");
				break;
			case 5:
				run = false;
				break;
			}
		}

		// DB에서 조회한 전체 학생목록을 while문 밖에서 출력
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).toString());
		}

	}

}
