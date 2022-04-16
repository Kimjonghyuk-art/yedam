package home.work0415;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BoardApp {
	
	ArrayList<Board> boardList = new ArrayList<Board>();
	LocalDateTime now = LocalDateTime.now();
	
	String date = now.format(DateTimeFormatter.ofPattern("MM월 dd일 HH시 MM분"));
	
	int bNo = 1;
	int bCnt = 0;
	
	//게시글 등록 메소드 
	public void create(String writer, String title, String content) {	
		
		boardList.add(new Board(bNo, writer, title, date, bCnt, content));
		System.out.println("저장되었습니다.");
		bNo++;
	}

	public void read() {
		System.out.println(boardList.toString());
	
	}

	//삭제 메소드 
	public void delete(int deleteNum) {
		
		boardList.remove(deleteNum-1);
		System.out.println("삭제 되었습니다.");
		bNo--;
	}
	
	
}
