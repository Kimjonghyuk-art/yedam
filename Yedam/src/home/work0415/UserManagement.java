package home.work0415;

import java.util.Scanner;

public class UserManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserApp ua = new UserApp();
		
		
		while(true) {
		
			System.out.println("1.회원가입 2.로그인 3.로그아웃 4.회원정보보기 5.회원비밀번호수정 6.게시글쓰러가기 7.종료");
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ua.signUp();
				break;
			case 2:
				ua.Login();
				break;
			case 3:
				ua.logout();
				break;
			case 4:
				ua.userInfo();
				break;
			case 5:
				ua.changePassword();
				break;
			case 6:
				ua.goBoard();
				break;
			case 7:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력하세요");
			}
			
			
			
		}
		
		

	}

}
