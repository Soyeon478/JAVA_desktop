package javadb191230;

import java.sql.*;
import java.util.*;
import javadb191230.JdbcConnection;

//쿼리문을 모아놓은 클래스 
public class Membersql {
	
	// DB 접속을 위한 변수 선언
	Connection con = null;
	
	// 쿼리문 전송을 위한 변수 선언
	PreparedStatement pstmt = null;
	
	// 조회(SELECT) 결과를 저장하기 위한 변수 선언
	ResultSet rs = null;

	public void dbConnection() {
		con = JdbcConnection.makeConnection();
	}

	// 회원가입 메소드
	public void memberJoin(Member member) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,TO_DATE(?,'YYYY/MM/DD'),?,?,SYSDATE)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getBirth());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getPassword());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("회원가입 완료!!");
		
	}


	// 아이디, 비밀번호 확인 메소드
	public boolean idCheck(String id, String password) {
		String sql = "SELECT ID FROM MEMBER WHERE ID=? AND PASSWORD=?";
		boolean checkResult = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next())
				checkResult = true;
			else 
				checkResult = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return checkResult;
	}

	// 폰번호 변경 메소드
	public void memberModify(String id, String phone) {
		String sql = "UPDATE MEMBER SET PHONE=? WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("수정 성공");
	}
	
	
	// 회원 탈퇴 메소드
	public void deleteMember(String password) {
		Scanner sc = new Scanner(System.in);
		String sql = "DELETE FROM MEMBER WHERE PASSWORD = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("탈퇴가 완료되었습니다.");
		} else if(result == 0) {
				System.out.println("탈퇴에 실패하였습니다.");
				System.out.println("아이디와 비밀번호를 확인해주세요.");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	public void memberList() {
		String sql = "SELECT * FROM MEMBER ORDER BY BIRTH DESC";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("ID")+"\t");
				System.out.print(rs.getString("PASSWORD")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.print(rs.getString("BIRTH")+"\t");
				System.out.print(rs.getString("EMAIL")+"\t");
				System.out.print(rs.getString("PHONE")+"\t");
				System.out.println(rs.getString("TO_DATE")+"\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
