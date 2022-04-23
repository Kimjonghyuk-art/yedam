package personal.project.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import personal.project.app.VO.BoardVO;

public class BoardService {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "scott";
	private String pw = "tiger";
	
	public List<BoardVO> getList(int page) throws SQLException, ClassNotFoundException {

		int start = 1 + (page-1)*10; 
		int end = 10*page; // 
		
		String sql = "SELECT * FROM testBoard_view WHERE NUM BETWEEN ? AND ?";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pw); //DB 연결
		PreparedStatement st = con.prepareStatement(sql);//connect를 이용해 sql명령을 실행하는 객체
		st.setInt(1, start);
		st.setInt(2,end);
		ResultSet rs = st.executeQuery(); //sql 실행 후 select 결과를 저장하는 객체
	
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		while(rs.next()) {
		int bNo = rs.getInt("bNO");
		String bTitle = rs.getString("bTitle");
		String bWriter = rs.getString("bWriter");
		String bContent = rs.getString("bContent");
		Date bWriteDate = rs.getDate("bWriteDate");
		int bCount = rs.getInt("bCount");
		
		BoardVO boardvo = new BoardVO(
				bNo,
				bTitle,
				bWriter,
				bContent,
				bWriteDate,
				bCount);
		list.add(boardvo);
		} 
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}
	
	
	//총 게시글 구하는 메소드
	public int getCount() throws ClassNotFoundException, SQLException {
		int count = 0;
		String sql = "SELECT COUNT(bNo) COUNT FROM testBoard";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pw); //DB 연결
		Statement st = con.createStatement();//connect를 이용해 sql명령을 실행하는 객체
		
		ResultSet rs = st.executeQuery(sql); //sql 실행 후 select 결과를 저장하는 객체
	
		if(rs.next())
			count = rs.getInt("COUNT");
		
		
		rs.close();
		st.close();
		con.close();
		
		return count;
	}
	
	
	public int insert(BoardVO BoardVO) throws ClassNotFoundException, SQLException {
			
				String bTitle =BoardVO.getbTitle();
				String bWirter =BoardVO.getbWriter();
				String bContent =BoardVO.getbContent();
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
				
				
				st.close();
				con.close();
		return result;
	}
	
	public int update(BoardVO BoardVO) throws SQLException, ClassNotFoundException {
		      
				String bTitle =BoardVO.getbTitle();
				String bContent =BoardVO.getbContent();
				int bNo =BoardVO.getbNo();
				//2. 드라이버 생성
				String sql = "UPDATE testboard"
						+ " SET "
						+ "bTitle =?,"
						+ " bContent = ?"
						+ "WHERE bNo = ?";
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url,id,pw); //DB 연결
				//Statement stmt = con.createStatement(); //connect를 이용해 sql명령을 실행하는 객체
				
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, bTitle);
				st.setString(2, bContent);
				st.setInt(3, bNo);
				
				int result = st.executeUpdate();
			
				st.close();
				con.close();
		return result;
	}
	
	public int delete(int bNo) throws ClassNotFoundException, SQLException {
	
		//2. 드라이버 생성
		String sql = "DELETE testboard"
				+ " WHERE bNo = ?";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pw); //DB 연결
		//Statement stmt = con.createStatement(); //connect를 이용해 sql명령을 실행하는 객체
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, bNo);
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		return result;
	}


}

	