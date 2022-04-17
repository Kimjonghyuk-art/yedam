package home.work0415;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class UserApp implements UserInterface {

	Scanner sc = new Scanner(System.in);
	int index = 0;
	ArrayList<User> userlist = new ArrayList<User>();

	boolean checkLogin = false;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Calendar now = Calendar.getInstance();
	String nowDate = sdf.format(now.getTime());

	@Override
	public void signUp() {
		// randomWord();
		System.out.print("아이디 입력 >");
		String id = sc.next();
		if(idCheck(id) == true) {
			System.out.print("비밀번호 입력 > ");
			String password = sc.next();
			System.out.print("주소 입력 > ");
			String address = sc.next();
			userlist.add(new User(id, password, address, nowDate));
			System.out.println("회원 가입이 완료 되었습니다.");
		}
	}

	@Override
	public void Login() {
		System.out.println("아이디 입력 > ");
		String id = sc.next();

		if(idCheck(id) == false) {		
			System.out.println("비밀번호 입력 > ");
			String password = sc.next();
			if(userlist.get(index).getPassword().equals(password)) {
				System.out.println("로그인 완료");
				checkLogin = true;
			}
		}
	}

	@Override
	public void logout() {
		System.out.print("로그아웃 하시겠습니까? y/n");
		String select = sc.next();
		if(select.equals("y")) { 
			checkLogin = false;
			System.out.println("로그아웃 되었습니다.");
		} else if(select.equals("n")) {
			System.out.println("메뉴로 돌아갑니다.");
		} else {
			System.out.println("잘못된 접근");
		}
	}

	@Override
	public void userInfo() {

		if(checkLogin == true) {
			System.out.print("현재 접속중인 ");
			userlist.get(index).userInfo();
		} else {
			System.out.println("현재 접속중 상태가 아닙니다 로그인하세여");
		}
	}

	@Override
	public void changePassword() {
		if(checkLogin == true) {
			System.out.print("현재 접속중인 ");
			userlist.get(index).userInfo();
			System.out.println("비밀번호를 입력하세요 > ");
			String password = sc.next();
			
			if(passwordCheck(password) == true) {
				System.out.print("수정할 비밀번호 입력 : ");
				String updatePassword = sc.next();
				userlist.get(index).setPassword(updatePassword);
				System.out.println("비밀번호 변경 완료!");
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}
		} else {
			System.out.println("현재 접속중 상태가 아닙니다 로그인하세여");
		}

	}

	// 랜덤 문자열 생성 후 리턴하는 메소드
	public boolean randomWord() {
		Random random = new Random();
		int length = random.nextInt(5) + 5;

		StringBuffer newWord = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int choice = random.nextInt(3);
			switch (choice) {
			case 0:
				newWord.append((char) ((int) random.nextInt(25) + 97));
				break;
			case 1:
				newWord.append((char) ((int) random.nextInt(25) + 65));
				break;
			case 2:
				newWord.append((char) ((int) random.nextInt(10) + 48));
				break;
			default:
				break;
			}
		}
		String newword = newWord.toString();
		System.out.println("Are you a human?");
		System.out.println(newword);
		System.out.print("입력 >>");
		String checkWord = sc.next();
		if (checkWord.equals(newword)) {
			System.out.println("같음");
			return true;
		} else {
			System.out.println("다름");
			return false;
		}
	}

	public boolean idCheck(String id) {
		for (int i = 0; i < userlist.size(); i++) {
			if (!userlist.isEmpty() && userlist.get(i).getId().equals(id)) {
				System.out.println("아이디 체크 완료!");
				index = i;
				return false;
			} 
		}
		return true;
	}
	
	public boolean passwordCheck(String password) {
		for(int i = 0; i < userlist.size(); i++) {
			if(!userlist.isEmpty() && userlist.get(i).getPassword().equals(password)) {
				System.out.println("맞는 비밀번호");
				return true;
			} else {
				System.out.println("비밀번호 틀림");
				return false;
			}
		}
		return false;
	}

	//게시글 쓰러 가게 하는 메소드 
	public void goBoard() {
		
		if(checkLogin == true) {
			BoardExe.main(null);
		}else {
			System.out.println("로그인하세요");
		}
		
		
	}
	
	//현재 로그인 중인지 확인하는 메소드
		public boolean currentCheckLogin() {
			if(checkLogin == true) {
				return true;
			} else {
				return false;	
			}
			
		}
	
	
}
