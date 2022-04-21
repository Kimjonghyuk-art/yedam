package yedam0419.interfaces2;

import java.util.ArrayList;

class Board {
	private String writer; //작성자
	private String content; //내용
	private int boardNo;//게시글번호
	//기본생성자
	public Board() {}
	public String getWriter() {
		return writer;
	}

	public Board(String writer, String content, int boardNo) {
		super();
		this.writer = writer;
		this.content = content;
		this.boardNo = boardNo;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	@Override
	public String toString() {
		return "Board [writer=" + writer + ", content=" + content + ", boardNo=" + boardNo + "]";
	}
	
}


public class Example {
	public static void main(String[] args) {
		
		
		//한가지 자료형만을 넣기에는 arraylist를 많이 생성해야 한다
		//그래서 우리가 사용할 자료형들을 하나의 클래스에 넣고 그 클래스 자체를
		//하나의 자료형으로 사용하고 싶다.
		
		//자료형   클래스이름  변수명       new  자료형    클래스이름
		ArrayList<Board> boardlist = new ArrayList<Board>();
		
		// 참고 > 밑에 두개는 결국 같은 내용임
		Board board = new Board("작성자","내용",1);
		boardlist.add(board);
		
		boardlist.add(new Board("작성자2","내용2",2));
		
		
		
		
	
	}
}
