package java191228;

import java.sql.*;
import java.util.*;

public class JdbcMain {

	public static void main(String[] args) {

		// 1. DBConnection 클래스의 makeConnection 메소드 호출하여 DB 접속 정보(con)를 가져옴
		// 2. con 객체를 가지고 DBsql 클래스의 메소드 호출하여 원하는 쿼리문 실행

//		Connection con = null;
//		con = DBConnection.makeConnection();

		DBsql sql = new DBsql();

		// 1번 전체 조회, 2번 데이터 저장, 3번 데이터 추가(?사용), 4번 데이터 추가(scanner사용), 5번 전체
		// 조회(ArrayList사용), 6번 여성인 학생출력, 7번 인천인 학생 출력, 8번 인천인 학생 검색하여 출력, 9번 학생번호 변경,
		// 10번 종료
		List<Student> stuList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		boolean run = true;

		while (run) {
			System.out.println(
					"0.DB 접속 | 1.전체 조회 | 2.데이터 추가 | 3.데이터 추가(?사용) | 4.데이터 추가(scanner) | 5.전체조회(ArrayList) | 6.여성 출력 | 7.인천 출력 | 8.인천 검색 출력 | 9.학생번호 변경 | 10.종료");
			int selectNum = sc.nextInt();
			switch (selectNum) {
			case 0:
				sql.dbConnection();
				break;
			case 1:
				sql.selectDB();
				break;
			case 2:
				sql.insertDB();
				break;
			case 3:
				sql.insertDB2();
				break;
			case 4:
				sql.insertDB3();
				break;
			case 5:
				// 전체조회 메소드를 호출하여 호출 결과를 가져옴
				stuList = sql.selectDB2();
				break;
			case 6:
				sql.selectDB3();
				break;
			case 7:
				sql.selectDB4();
				break;
			case 8:
				sql.selectDB5();
				break;
			case 9:
				sql.UpdateMobile();
				break;
			case 10:
				sql.deleteStu();
				break;
			case 11:
				run = false;
				break;
			}
		}
		// DB에서 전체 학생목록을 여기 위치에서 출력
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i).toString());
		}
		sc.close();
	}

}
