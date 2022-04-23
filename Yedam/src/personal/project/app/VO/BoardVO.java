package personal.project.app.VO;

import java.util.Date;

public class BoardVO {

	private int bNo; //게시글 번호
	private	String bTitle; //제목
	private String bWriter; //작성자
	private String bContent; //내용
	private Date bWriteDate; //날짜
	private int bCount; // 조회수
	
	
	public BoardVO() {
		
	}
	
	public BoardVO(int bNo, String bTitle, String bWriter, String bContent, Date bWriteDate, int bCount) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContent = bContent;
		this.bWriteDate = bWriteDate;
		this.bCount = bCount;
	}
	
	
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Date getbWriteDate() {
		return bWriteDate;
	}
	public void setbWriteDate(Date bWriteDate) {
		this.bWriteDate = bWriteDate;
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int bCount) {
		this.bCount = bCount;
	}
	
	
	
	
	
	
}
