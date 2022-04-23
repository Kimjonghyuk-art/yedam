package personal.project.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import personal.project.app.VO.BoardVO;
import personal.project.app.service.BoardService;

public class BoardConsole {
	
	private BoardService bservice;
	
	private int page; //현재 페이지값 
	
	public BoardConsole() {
		bservice = new BoardService();
		page = 1;
		
	}
	
	//출력메소드
	public void viewBoardList() throws ClassNotFoundException, SQLException {
	
		List<BoardVO> list = bservice.getList(page);
		int count = bservice.getCount(); //총 게시글 수 
		int lastPage = count/10;
		lastPage = count%10>0 ? lastPage+1:lastPage;
		
		System.out.println("──────────────────────────────────");
		System.out.printf("<게시판> 총 %d 게시글\n", count);
		System.out.println("──────────────────────────────────");
		for(BoardVO b : list) {
		System.out.printf("%d. %s / %s / %s \n",
				b.getbNo(), 
				b.getbTitle(), 
				b.getbWriter(), 
				b.getbWriteDate());
		}
		System.out.println("──────────────────────────────────");
		System.out.printf("            %d/%d pages\n", page, lastPage);
	}
	//메뉴입력메소드
	public int inputBoardMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.상세조회 2.이전 3.다음 4.글쓰기 5.종료 >");
		int menu = Integer.parseInt(sc.nextLine());
		
		return menu;
	}

	public void movePrevList() {
		if(page == 1) {
			System.out.println("======================");
			System.out.println("이전 페이지가없습니다.");
			System.out.println("======================");
			return;
		}
		page--;
	}

	public void moveNextList() throws ClassNotFoundException, SQLException {
		int count = bservice.getCount(); //총 게시글 수 
		int lastPage = count/10;
		lastPage = count%10>0 ? lastPage+1:lastPage;
		if(page == lastPage) {
			
			System.out.println("======================");
			System.out.println("다음 페이지가없습니다.");
			System.out.println("======================");
			return;
		}
		page++;
		
	}

	

}
