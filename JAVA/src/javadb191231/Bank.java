package javadb191231;

public class Bank {
	
	
	private int customerNo;
	private String name;
	private String accountNo;
	private String password;
	private int balance;
	
	@Override
	public String toString() {
		return "Bank [회원 번호=" + customerNo + ", 이름=" + name + ", 계좌번호=" + accountNo + ", 비밀번호="
				+ password + ", 잔액=" + balance + "]";
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}