package java191219;

public class Bank {

	// 필드선언
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	// 생성자(2가지) 선언
	// 기본 생성자
	public Bank() {
		
	}
	
	// get, set 메소드
	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int balance) {
		this.balance += balance;
		System.out.println("입금완료! 잔액 : " + this.balance);
	}
	
	public void withdraw(int balance) {
		this.balance -= balance;
		System.out.println("출금완료! 잔액 : " + this.balance);
	}
	
	// 메소드 생성자
	public Bank(int clientNumber, String name, String accountNumber, int balance) {
		this.clientNumber = clientNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[고객번호=" + clientNumber + ", 이름=" + name + ", 계좌번호=" + accountNumber
				+ ", 잔액=" + balance + "]";
	}
	
}
