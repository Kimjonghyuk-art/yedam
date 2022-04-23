package yedam.personal.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCTest2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//1. 4가지 정보 저장
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		
		
		String bTitle ="자바제목";
		String bWirter = "자바작성자";
		String bContent = "자바 내용";
		//2. 드라이버 생성
		String sql = "INSERT INTO "
				+ "testBoard(bTitle,bWriter,bContent)"
				+ " VALUES (?,?,?)";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pw); //DB 연결
		//Statement stmt = con.createStatement(); //connect를 이용해 sql명령을 실행하는 객체
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, bTitle);
		st.setString(2, bWirter);
		st.setString(3, bContent);
		
		int result = st.executeUpdate();
		
		System.out.println(result);
		
		
		
		st.close();
		con.close();
	}
}