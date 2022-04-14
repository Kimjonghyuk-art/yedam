package yedam0414;

import java.util.Scanner;

class BoardList {
	private int bNo = 1; // 게시글 번호
	private String title;
	private String writer; // 작성자
	private String content; // 내용
	private int bCnt = 0; // 조회수
	
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
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
	public int getbCnt() {
		return bCnt;
	}
	public void setbCnt(int bCnt) {
		this.bCnt = bCnt;
	}
	
}


class BoardStart {
	Scanner sc = new Scanner(System.in);
	private BoardList[] boardlist; 
	int maxBoard; 
	int bNoCnt = 1;
	int bNO = 1;
	private int bCnt = 0;
	public BoardStart(int maxBoard) {
		this.maxBoard = maxBoard;
		boardlist = new BoardList[maxBoard];
		for(int i = 0 ; i < boardlist.length; i++) {
			boardlist[i] = new BoardList();
		}
		
	}
	
	void run() {
		while(true) {
			System.out.print("1.입력 2.조회 3.수정 4.삭제 5.종료>>");
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("다시 시도하세요");
			}
			
		}
		
	}

	private void input() {
		
		System.out.print("제목 >>");
		String title = sc.next();
		System.out.print("내용 >>");
		String content = sc.next();
		System.out.println("작성자 >>");
		String writer = sc.next();
		boardlist[bNoCnt].setTitle(title);
		boardlist[bNoCnt].setContent(content);
		boardlist[bNoCnt].setWriter(writer);
		boardlist[bNoCnt].setbNo(bNO++); 
		bNoCnt++;
	}
	
	private void view() {
		
		for(int i = 0; i < boardlist.length; i++) {
			
			if(boardlist[i].getTitle() != null) {
				System.out.println(i);
				System.out.println("번호 >"+boardlist[i].getbNo());
				System.out.println("제목 >"+boardlist[i].getTitle());
				System.out.println("내용 >"+boardlist[i].getContent());
				System.out.println("작성자 >"+boardlist[i].getWriter());
				System.out.println("조회수 >"+boardlist[i].getbCnt());
				boardlist[i].setbCnt(bCnt++);
			}
			
		}
		
	}
	
	private void update() {
		
		System.out.print("수정할 게시글 작성자이름 입력 >>");
		String updateName = sc.next();
		for(int i = 0; i < boardlist.length; i++) {
			if(updateName.equals(boardlist[i].getWriter())) { //입력받은 값과 작성자 이름이 같다면
				System.out.println("수정할 제목 >");
				String updateTitle = sc.next();
				sc.nextLine();
				System.out.println("수정할 내용 >");
				String updateContent = sc.next();
				sc.nextLine();
				boardlist[i].setTitle(updateTitle);
				boardlist[i].setContent(updateContent);
			}
		}
	}
	
	private void delete() {
		
		System.out.print("삭제할 게시글 제목 입력 > ");
		String deleteTitle = sc.next();
		
		for(int i = 0; i < boardlist.length; i++) {
			if(deleteTitle.equals(boardlist[i].getTitle())) { //입력받은 값과 기존 제목이 같다면
				System.out.print("삭제 하시겠습니까? y/n");
				String choose = sc.next();
				
				if(choose.equals("y") ) {
					boardlist[i].setContent(null);
					boardlist[i].setTitle(null);
					boardlist[i].setWriter(null);
					System.out.println("삭제되엇습니다");
				} else if(choose.equals("n") ) {
					continue;
				}
				
			}
		}
		
		
	}
	
}


public class BoardExe {

	public static void main(String[] args) {
		
		BoardStart boardstart = new BoardStart(10);
		
		boardstart.run();
		

	}

}
