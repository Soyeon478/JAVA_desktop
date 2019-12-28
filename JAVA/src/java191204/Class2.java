package java191204;

public class Class2 {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자
		 * 문법
		 * (조건식) ? 조건식 true 결과 : 조건식 false 결과
		*/
		int score;
		score = 90;
		String grade;
		grade = (score > 60) ? "합격" : "불합격";
		System.out.println("grade 변수 값 : " + grade);
		
		int score1;
		score1 = 50;
		String grade1;
		grade1 = (score < 10) ? "합격" : "불합격";
		System.out.println("grade 변수 값 : " + grade1);
		
		/*
		 * 증감 연산자 (++, --)
		   - ++num : num이 가지고 있는 값에 1을 증가한 뒤 연산에 사용
		   - num++ : num이 가지고 있는 값을 연산에 사용 후 1을 증가시킴
		*/
		int num1 = 10;
		int num2 = 10;
		int num3;
		System.out.println("----------------");
		System.out.println("num1++ 수행 전 : " + num1);
		num1++;
		System.out.println("num1++ 수행 후 : " + num1);
		
		System.out.println("++num1 수행 전 : " + num1);
		++num1;
		System.out.println("++num1 수행 후 : " + num1);
		
		num3 = num1++;
		System.out.println("num1 값 : " + num1);
		System.out.println("num3 값 : " + num3);
		
		num3 = ++num1;
		System.out.println("num1 값 : " + num1);
		System.out.println("num3 값 : " + num3);
		// num1=14, num2=10, num3=14
		
		num3 = ++num1 + num2++; // 15+10
		// num1=15, num2=11
		System.out.println("num1 값 : " + num1); // 15
		System.out.println("num2 값 : " + num2); // 11
		System.out.println("num3 값 : " + num3); // 25
		
		num3 = ++num1 + ++num2; // 16+12
		// num1=16, num2=12
		System.out.println("num1 값 : " + num1); // 16
		System.out.println("num2 값 : " + num2); // 12
		System.out.println("num3 값 : " + num3); // 28
		
		num3 = num1++ + num2++; // 16+12
		// num1=17, num2=13
		System.out.println("num1 값 : " + num1); // 17
		System.out.println("num2 값 : " + num2); // 13
		System.out.println("num3 값 : " + num3); // 28
		
		num3 = num1++ + ++num2; // 17+14
		//num1=18
		System.out.println("num1 값 : " + num1); // 18
		System.out.println("num2 값 : " + num2); // 14
		System.out.println("num3 값 : " + num3); // 31
	}

}