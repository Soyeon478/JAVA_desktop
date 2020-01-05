package javadb191231;

import java.sql.*;
import java.util.*;

public class Banksql {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Bank customer = new Bank();
	
	public void dbConnection() {
		con = JdbcConnection.makeConnection();
	}
	
	Scanner sc = new Scanner(System.in);
	
	// 고객 등록 메소드
	public void customer(Bank bank) {
		String sql = "INSERT INTO BANK VALUES(BANK_seq.NextVal,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bank.getName());
			pstmt.setString(2, bank.getAccountNo());
			pstmt.setString(3, bank.getPassword());
			pstmt.setInt(4, bank.getBalance());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("고객등록 완료!!");
		
	}

	// 입금 메소드
	public void deposit(String accountNo, String password, int money) {
		String sql = "UPDATE BANK SET BALANCE = BALANCE + ? WHERE ACCOUNTNO = ? AND PASSWORD = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, accountNo);
			pstmt.setString(3, password);
			int result = pstmt.executeUpdate();
			if(result == 1) {
			System.out.println("입금 완료!!");
			} else {
				System.out.println("계좌번호와 비밀번호를 다시 확인해 주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 출금 메소드
	public void Withdrawal(String accountNo, String password, int money) {
		String sql = "UPDATE BANK SET BALANCE = BALANCE - ? WHERE ACCOUNTNO = ? AND PASSWORD = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, accountNo);
			pstmt.setString(3, password);
			int result = pstmt.executeUpdate();
			if(result == 1) {
			System.out.println("출금 완료!!");
			} else {
				System.out.println("계좌번호와 비밀번호를 다시 확인해 주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 잔액 조회 메소드
	public boolean checkBalance(String accountNo, String password) {
		String sql = "SELECT BALANCE FROM BANK WHERE ACCOUNTNO = ? AND PASSWORD = ?";
		boolean checkResult = true;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNo);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				checkResult = true;
				System.out.println("현재 잔액은 " + rs.getString("BALANCE") + "원 입니다.");
			} else {
				checkResult = false;
				System.out.println("계좌번호와 비밀번호를 다시 확인해 주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return checkResult;
		
	}
	
	// 송금 메소드
	
	
	
}
