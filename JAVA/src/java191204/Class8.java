package java191204;

import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {
		/*
		 * 중첩 if문
		 * 성적 출력 프로그램
		 * 1. 100점을 초과하는 점수 입력은 입력범위를 초과하였습니다. 출력
		 * 2. 학점 처리
		 * 95~100 : 당신의 학점은 A+ 입니다.
		 * 90~94 : 당신의 학점은 A 입니다.
		 * 85~89 : 당신의 학점은 B+ 입니다.
		 * 80~84 : 당신의 학점은 B 입니다.
		 * 75~79 : 당신의 학점은 C+ 입니다.
		 * 70~84 : 당신의 학점은 C 입니다.
		 * 65~69 : 당신의 학점은 D+ 입니다.
		 * 60~64 : 당신의 학점은 D 입니다.
		 * 60 미만 : 당신의 학점은 F 입니다.
		 * 
		 * 3. print 출력문은 두번만 쓸 것!
		 */
		
		Scanner scan = new Scanner(System.in);
		int score;
		String grade="";
		score = scan.nextInt();
		
		
		if(score<=100) {
		  if(score>=90) {
			  if(score>=95) {
				  grade = "A+";
			  } else {
				  grade = "A";
			  }
		  } else if(score>=80) {
			  if(score>=85) {
				  grade="B+";
			  } else {
				  grade="B";
			  }
		  } else if(score>=70) {
			  if(score>=75) {
				  grade="C+";
			  } else {
				  grade="C";
			  }
		  } else if(score>=60) {
			  if(score>=65) {
				  grade="D+";
			  } else {
				  grade="D";
			  }
		  }  else if(score<=60) {
			  	  grade="F";
		  	  }
			  } else { System.out.println("입력 범위를 초과 하였습니다.");
			  
		   	System.out.println("당신의 학점은" + grade + "입니다.");}
		  
		  
		  

		
	}

}
