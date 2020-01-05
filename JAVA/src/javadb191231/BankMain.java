package javadb191231;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banksql sql = new Banksql();
		Bank ba = new Bank();
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("0.DB접속 | 1.고객등록 | 2.입금 | 3.출금 | 4.잔액조회 | 5.송금 | 6.종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택> ");
			int selectNum = sc.nextInt();							
			switch (selectNum) {
			case 0 :
				sql.dbConnection();
				break;
			case 1 : 
				sql.customer();
				break;
			case 2 :					
				System.out.print("입금 할 계좌번호 : ");
				String accountNo = sc.next();
				System.out.print("비밀번호 : ");
				String password = sc.next();
				System.out.print("입금액 : ");
				int money = sc.nextInt();
				sql.deposit(accountNo, password, money);
				break;
				
			case 3 : 
				
			}
		}

	}
	
}
