package home.work0415;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BoardApp ba = new BoardApp();
		
		ArrayList<Board> boardList = new ArrayList<Board>();
		UserApp ua = new UserApp();
		
		while(ua.currentCheckLogin()) {
			
			int menu = 0;
			try {
				System.out.println("=====================================");
				System.out.println("1.등록 2.수정 3.삭제 4.목록조회 5.작성자조회 6.회원관리창 7.종료");	
				System.out.print("선택>>");
				menu = sc.nextInt();
				System.out.println("=====================================");
			} catch(InputMismatchException e) {
				System.out.println("에러ㅓㅓㅓㅓㅓㅓㅓㅓ");
				break;
			}
			

			switch(menu) {
			case 1:
				ba.create(); 
				break;
			case 2:
				ba.update();
				break;
			case 3:
				ba.delete();
				break;
			case 4:
				ba.read();
				break;
			case 5:
				ba.searchWriterRead();
				break;
			case 6:
				UserManagement.main(args);
				break;
			case 7:
				System.out.println("시스템 종료");
				System.exit(0);
				break;
			default :
				System.out.println("다시 입력하세요");
			}
			
			System.out.print("로그인하세열");
			
			
		}
		

	}



}
