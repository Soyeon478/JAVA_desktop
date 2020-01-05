package javadb191228;

import java.sql.*;
import java.util.*;

//쿼리문을 모아놓은 클래스
public class DBsql {

	// DB 접속을 위한 변수 선언
	Connection con = null;

	// 쿼리문 전송을 위한 변수 선언
	PreparedStatement pstmt = null;

	// 조회(SELECT) 결과를 저장하기 위한 변수 선언
	ResultSet rs = null;

	public void dbConnection() {
		con = DBConnection.makeConnection();
	}

	// STUDENT 테이블 전체 조회 메소드
	public void selectDB() {
		// 실행하고자 하는 쿼리문을 String 변수로 지정
		String sql = "SELECT * FROM STUDENT";

		try {
			// 접속한 DB에 쿼리문을 전송할 준비
			pstmt = con.prepareStatement(sql);
			// 쿼리문을 실행하고 실행결과를 rs에 저장
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("studentno"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.print(rs.getString("address"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// STUDENT 테이블에 데이터 추가
	public void insertDB() {
		String sql = "INSERT INTO STUDENT VALUES(7, '학생7', 23, '인천광역시 검암동', '여성', '010-7777-7777')";

		try {
			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("insert 결과 : " + result); // 성공하면 1, 실패하면 0 리턴
			System.out.println("DB에 저장 성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// STUDENT 테이블에 데이터 추가(?사용)
	public void insertDB2() {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 12);
			pstmt.setString(2, "학생7");
			pstmt.setInt(3, 20);
			pstmt.setString(4, "인천광역시 서구");
			pstmt.setString(5, "남자");
			pstmt.setString(6, "010-1515-1515");
			pstmt.executeUpdate();
			int result = pstmt.executeUpdate();
			System.out.println("insert 결과 : " + result); // 성공하면 1, 실패하면 0 리턴
			System.out.println("DB에 저장 성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// STUDENT 테이블에 scanner를 이용하여 데이터 추가
	public void insertDB3() {
		Scanner sc = new Scanner(System.in);
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("번호 입력");
			pstmt.setInt(1, sc.nextInt());
			System.out.println("이름 입력");
			pstmt.setString(2, sc.next());
			System.out.println("나이 입력");
			pstmt.setInt(3, sc.nextInt());
			System.out.println("주소 입력");
			pstmt.setString(4, sc.next());
			System.out.println("성별 입력");
			pstmt.setString(5, sc.next());
			System.out.println("전화번호 입력");
			pstmt.setString(6, sc.next());
			pstmt.executeUpdate();
			int result = pstmt.executeUpdate();
			System.out.println("insert 결과 : " + result);
			System.out.println("DB에 저장 성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// ArrayList를 이용하여 STUDENT 테이블 전체 조회
	public List<Student> selectDB2() {
		List<Student> stuList = new ArrayList<Student>();
		String sql = "SELECT * FROM STUDENT";
		Student stu = null;

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				stu = new Student();
				stu.setStudentNo(rs.getInt("studentno"));
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				stu.setAddress(rs.getString("address"));
				stu.setGender(rs.getString("gender"));
				stu.setPhone(rs.getString("phone"));
				stuList.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i).toString());
		}
		return stuList;

	}

	// STUDENT 테이블에 성별이 '여성'인 학생 조회
	public void selectDB3() {
		String sql = "SELECT * FROM STUDENT WHERE GENDER = '여성'";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("studentno"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.print(rs.getString("address"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// STUDENT 테이블에 지역이 '인천'인 학생 조회
	public void selectDB4() {
		String sql = "SELECT * FROM STUDENT WHERE ADDRESS LIKE '%인천%'";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("studentno"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.print(rs.getString("address"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// STUDENT 테이블에 지역이 '인천'인 학생 검색으로 조회
	public void selectDB5() {
		Scanner sc = new Scanner(System.in);
		String sql = "SELECT * FROM STUDENT WHERE ADDRESS LIKE ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("주소를 입력 하세요");
			pstmt.setString(1, "%" + sc.next() + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				pstmt.setString(1, "%인천%");
				System.out.print(rs.getInt("studentno"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.print(rs.getString("address"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// STUDENT 테이블 학생 번호 변경
	public void UpdateMobile() {
		Scanner sc = new Scanner(System.in);
		String sql = "UPDATE STUDENT SET PHONE = ? WHERE STUDENTNO = ?";

		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("수정할 학생번호를 입력 하세요");
			pstmt.setInt(2, sc.nextInt());
			System.out.println("수정할 전화번호를 입력 하세요");
			pstmt.setString(1, sc.next());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// STUDENT 테이블 데이터 삭제
	public void deleteStu() {
		Scanner scan = new Scanner(System.in);
		String sql = "DELETE FROM STUDENT WHERE STUDENTNO = ?";

		try {
			pstmt = con.prepareStatement(sql);
			System.out.print("삭제할 학생번호를 입력하세요 : ");
			pstmt.setInt(1, scan.nextInt());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
