package yedam.personal.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {
	public static void main(String[] args) {
				//1. 4가지 정보 저장
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "scott";
				String pw = "tiger";
				
				//2. 드라이버 생성 
				Connection con = null; //DB 연결
				//Statement stmt = null; //connect를 이용해 sql명령을 실행하는 객체
				//ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
				
				try {
					Class.forName(driver);
					
					con = DriverManager.getConnection(url,id,pw);
					
					System.out.println("Database에 연결되었습니다.");
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("Unkonwn error");
					e.printStackTrace();
				}
		
		
	}
}
