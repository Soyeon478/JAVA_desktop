package java191219;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 고객정보를 저장할 ArrayList 선언 (선언 위치 중요! 지역 or 전역)
		List<Bank> clientList = new ArrayList<Bank>();
		Bank bank = null;
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("0.계좌 생성(get,set) | " + " 1.계좌생성(생성자) | " + "2.입금 | " + "3.출금 | " + "4.송금 | " + "5.잔액 | "
					+ "6.고객정보");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();

			switch (select) {
			case 0:
				bank = new Bank();
				int clientNumber = clientList.size() + 1;
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("계좌 : ");
				String accountNumber = sc.next();
				System.out.print("입금액 : ");
				int balance = sc.nextInt();
				bank.setClientNumber(clientNumber);
				bank.setName(name);
				bank.setAccountNumber(accountNumber);
				bank.setBalance(balance);
				clientList.add(bank);
				break;
			case 1:
				clientNumber = clientList.size() + 1;
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("계좌 : ");
				accountNumber = sc.next();
				System.out.print("입금액 : ");
				balance = sc.nextInt();
				// 매개변수가 있는 생성자 호출을 통한 객체 생성
				bank = new Bank(clientNumber, name, accountNumber, balance);
				clientList.add(bank);
				break;
			case 2:
				System.out.print("계좌");
				accountNumber = sc.next();
				System.out.print("입금액");
				balance = sc.nextInt();
				// 입력된 계좌번호와 동일한 객체를 찾아서 그 객체에다가 입금액 추가
				for (int i = 0; i < clientList.size(); i++) {
					// 리스트에 저장된 계좌를 저장하기 위한 변수 사용
					String depositAno = clientList.get(i).getAccountNumber();
					if (depositAno.equals(accountNumber)) {
						clientList.get(i).deposit(balance);
					}
				}
				break;
			case 3:
				System.out.print("계좌");
				accountNumber = sc.next();
				System.out.print("출금액");
				balance = sc.nextInt();
				// 입력된 계좌번호와 동일한 객체를 찾아서 그 객체에다가 출금액 추가
				for (int i = 0; i < clientList.size(); i++) {
					// 리스트에 저장된 계좌를 저장하기 위한 변수 사용
					String withdrawAno = clientList.get(i).getAccountNumber();
					if (withdrawAno.equals(accountNumber)) {
						if (balance > clientList.get(i).getBalance()) {
							System.out.println("잔액이 부족합니다.");
							System.out.println("잔액 : " + clientList.get(i).getBalance());
						} else {
							clientList.get(i).withdraw(balance);
						}
					}
				}
				break;
			case 4:

				break;
			case 5:
				System.out.print("계좌");
				accountNumber = sc.next();
				for (int i = 0; i < clientList.size(); i++) {
					if (clientList.get(i).getAccountNumber().equals(accountNumber)) {
						System.out.println("잔액은 " + clientList.get(i).getBalance() + "원 입니다.");
					}
				}
				break;
			case 6:
				for (int i = 0; i < clientList.size(); i++) {
					System.out.println(clientList.get(i).toString());
				}
				run = false;
				break;
			default:
			}
		}
		sc.close();
	}

}
