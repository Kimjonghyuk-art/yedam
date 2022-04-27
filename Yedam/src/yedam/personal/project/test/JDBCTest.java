package yedam.personal.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class JDBCTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//1. 4가지 정보 저장
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//String url = "jdbc:oracle:thin:@jonghyuk_high?TNS_ADMIN=C:\\dev\\db\\Wallet_JongHyuk.zip";
		String id = "scott";
		String pw = "tiger";
		
		
		//2. 드라이버 생성
		String sql = "SELECT * FROM testBoard WHERE bCount >= 10";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pw); //DB 연결
		Statement stmt = con.createStatement(); //connect를 이용해 sql명령을 실행하는 객체
		ResultSet rs = stmt.executeQuery(sql); //sql 실행 후 select 결과를 저장하는 객체
	
		while(rs.next()) {
		int bNo = rs.getInt("bNO");
		String bTitle = rs.getString("bTitle");
		String bWriter = rs.getString("bWriter");
		Date bWriteDate = rs.getDate("bWriteDate");
		int bCount = rs.getInt("bCount");
		System.out.println(bNo+", " + bTitle + ", " + bWriter + ", " +
		 bWriter + ", " + bWriteDate + ", " + bCount);
		} 
		
		rs.close();
		stmt.close();
		con.close();
	}
}