package java191218;

import java.util.*;

public class Ex04_Long {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int max = 0;
		for(int i = 0; i < 5; i++) {
		System.out.println("단어를 입력하세요 : ");
		list.add(sc.next());
		String str = list.get(i);
		max = str.length();
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("가장 긴 단어는 : ");
		
		
	}

}
