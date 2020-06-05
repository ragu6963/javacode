package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.standard.PresentationDirection;

public class SimpleJDBC {
	public static void main(String[] args) {

		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (Exception e) {
			System.out.println("드라이버 로드 실패");
		}

		// 커넥션 생성
		Connection conn = null;
		try {
			String URL = "jdbc:oracle:thin:@localhost:1521/XE";
			String ID = "hr";
			String PWD = "hr";
			conn = DriverManager.getConnection(URL, ID, PWD);
			System.out.println(conn);

			// SQL 구문 작성
			String sql = "select first_name, salary from employees where employee_id = 103";

			// STATEMENT 객체 생성
			PreparedStatement stmt = conn.prepareStatement(sql);

			// 쿼리문 실행
			ResultSet rs = stmt.executeQuery();

			// 결과
			if (rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				System.out.println("name : " + name + ", salary : " + salary);
				
			} else {
				System.out.println("데이터 없음");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
		}
	}
}