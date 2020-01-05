package javadb191231;

import java.sql.*;
import java.util.*;

public class Banksql {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	Bank customer = new Bank();

	public void dbConnection() {
		con = JdbcConnection.makeConnection();
	}
	
	// 고객 등록 메소드
	public void customer() {
		String sql = "INSERT INTO BANK VALUES(BANK_seq.NextVal,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			System.out.print("이름 입력 : ");
			pstmt.setString(1, sc.next());
			System.out.print("계좌번호 입력 : ");
			pstmt.setString(2, sc.next());
			System.out.print("비밀번호 입력 : ");
			pstmt.setString(3, sc.next());
			System.out.print("잔고 입력 : ");
			pstmt.setInt(4, sc.nextInt());
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("고객 등록에 성공 하였습니다.");
			} else if (result == 0) {
				System.out.println("고객 등록에 실패 하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 입금 메소드
	// UPDATE BANK SET BALANCE = BALANCE + ? WHERE ACCOUNTNO = ?";
	
	public void deposit(String accountNo, String password, int money) {
		String sql = "SELECT * FROM BANK WHERE ACCOUNTNO = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,accountNo);
			rs = pstmt.executeQuery();
			if(!rs.next()) {
				System.out.println("일치하는 계좌번호가 없습니다.");
			}
			else {
				if(password.equals(rs.getString("PASSWORD"))) {
					int balance = rs.getInt("BALANCE")+money;
					sql = "UPDATE BANK SET BALANCE = ? WHERE ACCOUNTNO = "+accountNo;
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, balance);
					System.out.println(rs.getString("NAME")+"님의 계좌에 "+money+"원을 입금하시겠습니까?");
					System.out.println("O / X 선택 > ");
					String check = sc.next();
					int num = check.charAt(0);
					if(num == 79 || num ==111) {
						int result = pstmt.executeUpdate();
						if(result == 1) {
							System.out.println("입금되었습니다.");
							System.out.println("잔고는 "+balance+"원입니다.");
						}else System.out.println("입금이 정상적으로 이루어지지 않았습니다.");
					}else System.out.println("입금을 취소합니다.");
				}else System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
