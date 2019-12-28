package java191204;

public class Class1 {

	public static void main(String[] args) {
		// 비교 연산자
		/*
		 * 정수형 변수 2개를 선언하고 값을 저장한 다음 비교 연산 결과를 result에 대입하여 result 값을 출력하시오.
		 */

		int num1, num2;
		num1 = 5;
		num2 = 3;
		boolean result;
		result = num1 > num2;
		System.out.println(result);
		result = num1 < num2;
		System.out.println(result);
		num1 = 3;
		result = num1 <= num2;
		System.out.println(result);
		result = num1 == num2;
		System.out.println(result);
		result = num1 != num2;
		System.out.println(result);
		
		String str1 = "자바";
		String str2 = "자바";
		result = str1.equals(str2);
		System.out.println(result);
		
		num1 = 1;
		double num3 = 1.0;
		result = num1 == num3; // 정수가 실수형태로 변환되서 나타났다
		System.out.println(num1 + "" + num3 + "" + result);
		
		// 대입연산자
		// +=, -=, *=, /=, %=
		// 정수형 변수 2개 선언해서 대입연산자를 이용하여 연산을 수행하고 연산 결과를 출력하시오.
		// a += b => a = a + b
		int num4, num5, result2;
		num4 = 10;
		num5 = 5;
		result2 = num4 += num5; // 10=10+5
		System.out.println(result2);
		result2 = num4 -= num5; // 10=10-5
		System.out.println(result2);
		result2 = num4 *= num5; // 10=10*5
		System.out.println(result2);
		result2 = num4 /= num5; // 10=10/5
		System.out.println(result2);
		result2 = num4 %= num5; // 10=10%5
		System.out.println(result2);
		num4 += num5;
		
		
		/*
		 * 논리 연산자 (bool 타입으로만 들어갈수 있음)
		  - && (AND 연산) : A && B 일 때 A, B 모두 true여야 결과가 true
		  	     		   A, B 중에 하나라도 false가 있다면 결과는 false
		  - || (OR 연산) : A || B 일때 A, B 중에 하나라도 true면 결과는 true
		  		 		  A, B 모두 false여야 결과가 false
		  - ! (NOT 연산) : boolean 변수 앞에 사용하면 결과 반전
		 ﻿* AND, OR 연산은 비교연산자가 올수 있음
		  		*/
		
		boolean result3;
		result3 = true && true;
		System.out.println(result3); 
		result3 = true && false;
		System.out.println(result3); 
		result3 = (5>3) && (3>1);
		System.out.println(result3); 
		
		result3 = true || false; // 시작이 true라 뒤에 코드는 필요가 없다
		System.out.println(result3); 
		result3 = false || false;
		System.out.println(result3); 
		result3 = (5>3) || (3<1);
		System.out.println(result3); 
		
		result3 = !result3;
		System.out.println(result3);  
	}

}