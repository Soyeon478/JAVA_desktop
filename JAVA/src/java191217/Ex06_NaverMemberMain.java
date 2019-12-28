package java191217;

import java.util.ArrayList;
import java.util.List;

public class Ex06_NaverMemberMain {

	public static void main(String[] args) {

		Ex06_NaverMember member = new Ex06_NaverMember("ghdrl1", "1234", "이홍기", "남", "1990.03.02", "ghdrl2648@naver.com",
				"010-0000-0000");

		// id 필드에 저장된 값 getter 메소드 이용하여 출력하기
		System.out.println(member.getId());

		// id 필드값을 bb로 저장
		member.setId("bb");
		System.out.println(member.getId());

		/*
		 * NaverMember 클래스에 기본 생성자를 선언하여 기본 생성자를 이용해 member1 객체를 선언한 뒤 모든 필드 값을 본인 옆사람의
		 * 정보로 지정해보세요
		 */
		Ex06_NaverMember member1 = new Ex06_NaverMember();
		member1.setId("sunyeong");
		member1.setPassword("25468");
		member1.setName("원선영");
		member1.setBirth("1993.05.03");
		member1.setGender("여");
		member1.setEmail("BTS7@naver.com");
		member1.setPhone("010-1234-5678");

		// 배열객체
		// 사용자 정의 자료형
		// NaverMember member3 = null; (변수)
		// member3 = new NaverMember();

		// 배열을 이용해 데이터 저장하기
		// NaverMember 클래스 타입의 members 배열 선언
		Ex06_NaverMember[] members = new Ex06_NaverMember[100];
		members[0] = member;
		members[1] = member1;
		// members 배열의 0번 인덱스에 저장된 id 필드값을 출력
		System.out.println(members[0].getId());

		// ArrayList를 선언하여 member 각체들을 저장하고 각 객체의 id 필드값을 출력해보세요.
		List<Ex06_NaverMember> memberList = new ArrayList<Ex06_NaverMember>();

		memberList.add(member);
		memberList.add(member1);

		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).getId());
		}

	}

}
