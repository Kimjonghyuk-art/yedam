package home.work0415;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardApp {
	static ArrayList<Board> boardList = new ArrayList<Board>();
	LocalDateTime now = LocalDateTime.now();
	// ArrayList<User> userlist = new ArrayList<User>();
	String date = now.format(DateTimeFormatter.ofPattern("MM월 dd일 HH시 MM분"));
	static Scanner sc = new Scanner(System.in);
	static int bNo = 1;
	int bCnt = 0;
	UserApp ua = new UserApp();

	// 실행 메소드
	public void run() {
		while (ua.currentCheckLogin() == true) {
			int menu = 0;
			try {
				System.out.println("=====================================");
				System.out.println("1.등록 2.수정 3.삭제 4.목록조회 5.작성자조회 6.회원관리창 7.종료");
				System.out.print("선택>>");
				menu = sc.nextInt();
				System.out.println("=====================================");
			} catch (InputMismatchException e) {
				System.out.println("에러ㅓㅓㅓㅓㅓㅓㅓㅓ");
				break;
			}

			switch (menu) {
			case 1:
				create();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				read();
				break;
			case 5:
				searchWriterRead();
				break;
			case 6:
				ua.run();
				break;
			case 7:
				System.out.println("시스템 종료");
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}

		}
		System.out.println("로그인하세요");
	}

	// 게시글 등록 메소드
	public void create() {
		
		if (ua.checkLogin == true) {
			System.out.print("제목 입력 >");
			String title = sc.next();
			System.out.print("내용 입력 >>");
			String content = sc.next();
			System.out.println(ua.userlist().get(ua.index).getId());
			boardList.add(new Board(bNo, ua.userlist.get(ua.index).getId(), title, date, bCnt, content));
			System.out.println("저장되었습니다.");
			bNo++; // 저장후 게시글 번호 증감처리
		}
	}

	// 출력 메소드
	public void read() {
		if (!boardList.isEmpty()) {
			for (Board i : boardList) {
				System.out.println(i);
			}
		} else {
			System.out.println("등록된 게시글이 없습니다.");
		}

	}

	// 삭제 메소드
	public void delete() {
		System.out.print("삭제할 게시글 번호 선택 >");
		int deleteNum = sc.nextInt();
		boardList.remove(deleteNum - 1);
		System.out.println("삭제 되었습니다.");
		bNo--; // 삭제 후 게시글 번호 감소 처리
	}

	// 수정 메소드
	public void update() {
		System.out.print("수정할 게시글 번호 입력 >>");
		int updatebNo = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getbNo() == updatebNo) {
				System.out.print("수정할 내용 입력 >>");
				String updateContent = sc.nextLine();
				boardList.get(i).setContent(updateContent);
				boardList.get(i).setDate(date);
				System.out.println("내용 변경이 완료되었습니다.");
			} else {
				System.out.println("다른 게시글");
			}
		}
	}

	// 작성자 조회
	public void searchWriterRead() {
		System.out.print("조회할 작성자 이름 입력 > ");
		String searchName = sc.next();
		boolean check = false;
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getWriter().equals(searchName)) {
				int currentbCnt = boardList.get(i).getbCnt();
				System.out.println(boardList.get(i).toString());
				boardList.get(i).setbCnt(++currentbCnt); // 조회수 증가처리
				check = true;
				continue;
			}

		}
		if (check == false) {
			System.out.println("조회할 이름이 없다야");
		}

	}

}
