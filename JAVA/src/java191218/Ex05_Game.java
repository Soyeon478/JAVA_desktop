package java191218;

import java.util.*;

public class Ex05_Game {

	public static void main(String[] args) {
		/*
		 * 문제1. watch의 뜻은 무엇인가요? 문제2. chair의 뜻은 무것인가요? 문제3. desk의 뜻은 무엇인가요? 문제4. pencil의
		 * 뜻은 무엇인가요? 문제5. water의 뜻은 무엇인가요? 총 n개 정답입니다. 정답률은 n.n% 입니다.
		 */

		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		int count = 0;
		int i = 1;
		map.put("whtch", "시계");
		map.put("chair", "의자");
		map.put("desk", "책상");
		map.put("pencil", "연필");
		map.put("water", "물");

		Set<String> keyValues = map.keySet();
		Iterator<String> iterator = keyValues.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("문제" + (i) + "." + key + "의 뜻은 무엇인가요?");
			String dap = sc.next();
			String value = map.get(key);
			if (dap.equals(value)) {
				System.out.println("정답 입니다.");
				count++;
			} else {
				System.out.println("틀렸습니다. 정답은 " + value + "입니다.");
			}
			i++;
		}
		System.out.println("정답은" + count + "개 입니다.");
		double percent = 100 * ((double) count / map.size());
		System.out.println("정답률은 " + percent + "% 입니다.");

		String str = "가가가";
		System.out.println(str.length());
		
		sc.close();
	}

}
