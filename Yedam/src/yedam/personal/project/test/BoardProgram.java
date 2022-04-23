package yedam.personal.project.test;

import java.sql.SQLException;

import personal.project.app.console.BoardConsole;

public class BoardProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		BoardConsole console = new BoardConsole();

		EXIT:
			while (true) {

			console.viewBoardList();
			int menu = console.inputBoardMenu();

			switch (menu) {
			case 1: // 상세조회
				break;
			case 2: // 이전
				break;
			case 3: // 다음
				break;
			case 4: // 글쓰기
				break;
			case 5: // 종료
				System.out.println("끝났습니다.");
				break EXIT;
			default:
				System.out.println("메뉴 잘못입력");
				break;
			}

		}
		
		
		
	}

}
