package java191218;

import java.util.*;

public class Ex03_Map {

	public static void main(String[] args) {
		// map 객체 선언
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// map 객체에 데이터 저장하기
		map.put(10, "박지훈");
		map.put(20, "하성운");
		map.put(30, "옹성우");
		
		// map 크기 출력
		System.out.println(map.size());
		
		// map에 저장된 데이터 출력
		System.out.println(map.get(20));
		
		// map 객체의 모든 데이터 출력
		// key값을 set형태로 만들어서 set에서 사용하는 반복자 적용
		Set<Integer> keyValues = map.keySet();
		Iterator<Integer> iterator = keyValues.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			int key = iterator.next();
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
	}

}
