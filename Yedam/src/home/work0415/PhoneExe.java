package home.work0415;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		HashMap<String, Phone> map = new HashMap<String, Phone>();
		PhoneManagement pm = new PhoneManagement();
		System.out.println("===============================");
		System.out.println("전화번호부 프로그램입니다");
		System.out.println("===============================");
		
		while(true) {
			System.out.print("등록: 0, 삭제:1, 찾기:2, 전체보기3, 종료:4 >>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 0:
				pm.insert(map);
				break;
			case 1:
				pm.delete(map);
				break;
			case 2:
				pm.search(map);
				break;
			case 3:
				pm.printall(map);
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력했어열");
			}
		}
	}
}
