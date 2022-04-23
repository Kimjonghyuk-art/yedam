package personal.project.app.console;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import personal.project.app.VO.BoardVO;
import personal.project.app.service.BoardService;

public class BoardConsole {
	
	private BoardService bservice;
	
	public BoardConsole() {
		bservice = new BoardService();
	}
	
	//출력메소드
	public void viewBoardList() throws ClassNotFoundException, SQLException {
		List<BoardVO> list = bservice.getList(1);
		
		System.out.println("──────────────────────────────────");
		System.out.printf("<게시판> 총 %d 게시글\n", 12);
		System.out.println("──────────────────────────────────");
		for(BoardVO b : list) {
		System.out.printf("%d. %s / %s / %s \n",
				b.getbNo(), 
				b.getbTitle(), 
				b.getbWriter(), 
				b.getbWriteDate());
		}
		System.out.println("──────────────────────────────────");
		System.out.printf("            %d/%d pages\n", 1, 2);
	}
	//메뉴입력메소드
	public int inputBoardMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.상세조회 2.이전 3.다음 4.글쓰기 5.종료 >");
		int menu = Integer.parseInt(sc.nextLine());
		
		return menu;
	}

}
