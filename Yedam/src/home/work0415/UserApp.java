package home.work0415;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class UserApp implements UserInterface {

	Scanner sc = new Scanner(System.in);
	ArrayList<User> userlist = new ArrayList<User>();

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
		}
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userInfo() {

	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub

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
				System.out.println("중복값 존재");
				return false;
			} else {
				return true;
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
	
	
}
