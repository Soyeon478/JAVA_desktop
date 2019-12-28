package java191218;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 1. List
		 * - 순서(인덱스)를 유지하고 저장할 수 있음
		 * - 중복저장 가능
		 * 2. Set
		 * - 저장데이터의 순서가 없음
		 * - 중복저장 불가능(인덱스 X)
		 * 3. Map
		 * - key(인덱스 대신 사용한다고 생각하면됨), value의 쌍으로 저장
		 * - key값은 중복 불가능
		 */
		
		// List 객체 선언
		List<String> list = new ArrayList<String>();
		// <타입>	 	 <변수>			<객체화>
		
		/*
		 * <> : Generic
		 * 타입변환을 하지 않고도 데이터를 사용할 수 있게 해줌
		 */
		
		// list 객체에 데이터 저장
		list.add("홍스타");
		list.add("홍광이");
		list.add("스컬홍");
		list.add(1, "사랑해요~"); // 1번 index에 저장하면 기존 저장값이 뒤로 밀림
		list.add(1, "이홍기");
		list.add("홍홍홍홍");
		
		// list에 저장된 데이터 출력
		System.out.println(list.get(0)); // list도 index 0번부터 시작, 갯수 상관없이 계속 저장 가능
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		// list의 크기 출력
		System.out.println(list.size());
		
		// list 데이터 삭제
		list.remove(1);
		list.remove("홍홍홍홍");
		// 전체 데이터 지울때 사용
//		list.clear();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		List<Integer> listInt = new ArrayList<Integer>();
		// Integer : int의 클래스
		
		
		
		
//		List list1 = new ArrayList(); // ArrayList는 Object타입으로 저장됨
//		// ArrayList 객체에 데이터 저장
//		// Object타입 (기억하지않아도됨)
//		list1.add("이홍기");
//		Object objValue = list1.get(0);
//		String value = (String) objValue;
//		System.out.println(list1.get(0));
//		System.out.println(list1.get(0));
		
		
	}

}
