package javadb191231;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banksql sql = new Banksql();
		Bank bank = null;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("0.DB접속 | 1.고객등록 | 2.입금 | 3.출금 | 4.잔액조회 | 5.송금 | 6.회원조회 | 7.종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNum = sc.nextInt();	
			
			switch (selectNum) {
			case 0 :
				sql.dbConnection();
				break;
			case 1 :
				bank = new Bank();
				
				System.out.print("이름 : ");
				String name = sc.next();
				bank.setName(name);
				
				System.out.print("계좌번호 : ");
				String accountNo = sc.next();
				bank.setAccountNo(accountNo);
				
				System.out.print("비밀번호 : ");
				String password = sc.next();
				bank.setPassword(password);
				
				System.out.print("잔액 : ");
				int balance = sc.nextInt();
				bank.setBalance(balance);
								
				sql.customer(bank);
				break;
			case 2 :
				System.out.print("계좌번호 입력 : ");
				accountNo = sc.next();
				
				System.out.print("비밀번호 입력 : ");
				password = sc.next();
				
				System.out.print("입금액 입력 : ");
				int money = sc.nextInt();
				
				sql.deposit(accountNo, password, money);
				break;
			case 3 :
				System.out.print("계좌번호 입력 : ");
				accountNo = sc.next();
				
				System.out.print("비밀번호 입력 : ");
				password = sc.next();
				
				System.out.print("출금액 입력 : ");
				money = sc.nextInt();
				
				sql.Withdrawal(accountNo, password, money);
				break;
			case 4 :
				System.out.print("계좌번호 입력 : ");
				accountNo = sc.next();
				
				System.out.print("비밀번호 입력 : ");
				password = sc.next();
				
				sql.checkBalance(accountNo, password);
				break;
			case 5 :
				
				break;
			case 6 :
				sql.customerList();
				break;
			case 7 :
				run = false;
				System.out.println("종료 되었습니다.");
				break;
			}
		}
		
		
	}
	
}
