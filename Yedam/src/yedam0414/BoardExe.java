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
	private BoardList[] boardlist; //BoardList의 배열 선언
	private int maxBoard; //만들 게시판 최대 수
	private int bNoCnt = 1; // 조회수
	private int bNO = 1; // //글 번호
	private int bCnt = 0; //조회수 기본값 0
	
	//생성자 실행
	public BoardStart(int maxBoard) {
		this.maxBoard = maxBoard;
		boardlist = new BoardList[maxBoard]; //boardlist를 메인메소드에서 받은 인자값
											// 10 할당 즉 0~9까지의 10개의 배열 선언
		for(int i = 0 ; i < boardlist.length; i++) { 
			boardlist[i] = new BoardList(); //boardlist의 길이만큼 객체 생성
		}
		
	}
	//실행 메소드 
	void run() {
		while(true) {
			System.out.print("1.입력 2.전체조회 3.수정 4.삭제 5.이름조회 6.종료>>");
			int selectNum = sc.nextInt();
			
			switch(selectNum) { // 입력받은 값 비교
			case 1:
				input(); //입력 메소드
				break;
			case 2:
				view(); // 출력 메소드
				break;
			case 3:
				update(); // 수정 메소드
				break;
			case 4:
				delete(); // 삭제 메소드
				break;
			case 5:
				detailView();
				break;
			case 6:
				System.out.println("종료합니다."); // 5를 입력받았을 경우 종료
				System.exit(0);
			default: // 다른 값을 입력받았을 경우 다시시도 
				System.out.println("다시 시도하세요");
			}
			
		}
		
	}
	
	//입력 메소드
	private void input() {
		System.out.print("제목 >>");
		String title = sc.next();
		sc.nextLine();
		System.out.print("내용 >>");
		String content = sc.nextLine();
		sc.nextLine();
		System.out.print("작성자 >>");
		String writer = sc.next();
<<<<<<< HEAD
		//위에서 스캐너로 입력 받은 값을 게시글 번호를 기준으로 할당
		boardlist[bNO].setTitle(title);
		boardlist[bNO].setContent(content);
		boardlist[bNO].setWriter(writer);
		//할당 후 게시글 번호 증감연산자로 증가 처리
		boardlist[bNO].setbNo(bNO++); 
=======
		boardlist[bNoCnt].setTitle(title);
		boardlist[bNoCnt].setContent(content);
		boardlist[bNoCnt].setWriter(writer);
		boardlist[bNoCnt].setbNo(bNO++); 
>>>>>>> branch 'master' of https://github.com/Kimjonghyuk-art/yedam.git
	}
	//출력 메소드
	private void view() {
		
		for(int i = 0; i < boardlist.length; i++) {
			if(boardlist[i].getTitle() != null) {//타이틀에 값이 있을 때
				System.out.println(i);
				//값이 있다면 get메소드로 출력
				System.out.println("번호 >"+boardlist[i].getbNo());
				System.out.println("제목 >"+boardlist[i].getTitle());
				System.out.println("내용 >"+boardlist[i].getContent());
				System.out.println("작성자 >"+boardlist[i].getWriter());
				System.out.println("조회수 >"+boardlist[i].getbCnt());
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
	
	//상세 뷰
	private void detailView() {
		System.out.print("검색할 작성자 이름 입력 >>");
		String searchName = sc.next();
		for(int i = 0; i <boardlist.length; i++) {
			//입력받은 값과 boardlist의 writer이름이 같을 때
			if(searchName.equals(boardlist[i].getWriter())) {
				boardlist[i].setbCnt(++bCnt);; //조회수 선증가 처리
				System.out.println("번호 >"+boardlist[i].getbNo());
				System.out.println("제목 >"+boardlist[i].getTitle());
				System.out.println("내용 >"+boardlist[i].getContent());
				System.out.println("작성자 >"+boardlist[i].getWriter());
				System.out.println("조회수 >"+boardlist[i].getbCnt());
				 break;
			}
		}
		
	}
}


public class BoardExe {

	public static void main(String[] args) {
		//BoardStart에 대한 객체 생성
		BoardStart boardstart = new BoardStart(10); // 생성자에 정수 10 할당 
		
		boardstart.run(); // 실행 메소드
		

	}

}
