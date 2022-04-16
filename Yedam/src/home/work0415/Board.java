package home.work0415;

import java.time.LocalDate;

public class Board {

	private int bNo; // 게시글 번호
	private String writer; // 작성자
	private String title; //제목
	private String date; // 현재 날짜
	private int bCnt; //조회수
	private String content; // 내용 
	
	public Board(int bNo, String writer, String title, String content) {
		this.bNo = bNo;
		this.writer = writer;
		this.title = title;
		this.content = content;
		
	}
	
	public Board(int bNo, String writer, String title, String date, int bCnt, String content) {
		super();
		this.bNo = bNo;
		this.writer = writer;
		this.title = title;
		this.date = date;
		this.bCnt = bCnt;
		this.content = content;
	}




	public Board(String writer,String title,String content) {
	
	}
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getbCnt() {
		return bCnt;
	}

	public void setbCnt(int bCnt) {
		this.bCnt = bCnt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", writer=" + writer + ", title=" + title + ", date=" + date + ", bCnt=" + bCnt
				+ ", content=" + content + "]";
	}

	
	
}
