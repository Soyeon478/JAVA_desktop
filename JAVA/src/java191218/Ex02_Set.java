package java191218;

//java에 있는 모든 유틸을 호출
import java.util.*;

public class Ex02_Set {

	public static void main(String[] args) {
		// Set 객체 선언 (Set : 주머니(순서X))
		// set이 Hashset 보다 상위 카테고리
		Set<String> set = new HashSet<String>();
		
		// set 객체에 데이터 저장
		set.add("이홍기");
		set.add("이재진");
		set.add("최민환");
		set.add("최민환"); // 중복 저장 안되기때문에 "최민환"은 하나로 저장되고 size 3만 출력
		
		// set 크기 출력
		System.out.println(set.size());
		
		// set에 저장된 데이터 출력
		// Iterator : 반복자
		// hasNext(bool타입) : 출력할 데이터가 있으면 true, 없으면 false
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set에 담긴 데이터 삭제
		set.remove("최민환");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
