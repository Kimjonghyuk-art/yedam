package home.work0415;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BoardApp ba = new BoardApp();
		
		ArrayList<Board> boardList = new ArrayList<Board>();
	
		while(true) {
			
			int menu = 0;
			
			try {
				System.out.println("=====================================");
				System.out.println("1.등록 2.수정 3.삭제 4.목록조회 5.작성자조회 6.종료");	
				System.out.print("선택>>");
				menu = sc.nextInt();
				System.out.println("=====================================");
			} catch(InputMismatchException e) {
				System.out.println("에러ㅓㅓㅓㅓㅓㅓㅓㅓ");
				break;
			}
			

			switch(menu) {
			case 1:
				System.out.print("작성자 입력 >");
				String writer = sc.next();
				sc.nextLine();
				System.out.print("제목 입력 >");
				String title = sc.nextLine();
				System.out.print("내용 입력 >>");
				String content = sc.nextLine();
				ba.create(writer,title,content);
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				ba.read();
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("시스템 종료");
				System.exit(0);
				break;
			default :
				System.out.println("다시 입력하세요");
			}
			
			
			
			
		}
		

	}

}
