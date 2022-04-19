package yedam0419.collection;

import java.util.Scanner;

import yedam0418.Inheritance.ex.Friend;

//친구목록 저장하기  APP.
//추가, 수정, 삭제, 조회
//ver1 배열 ver2 컬렉션  <= 인터페이스 구현 
public class FriendApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//FriendService fs = new FriendServiceArray();
		FriendService fs = new FriendServiceList();
		
		//추가, 수정, 삭제, 조회 => 컨트롤 역할
		
		while(true) {
			
			System.out.println("1.추가 2.수정 3.삭제 4.한건 조회 5. 종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("입력할 이름 >");
				String name = sc.next();
				System.out.println("입력할 전화번호 > ");
				String tel = sc.next();
				Friend insertFriend = new Friend(name,tel);
				
				fs.insert(insertFriend);
				break;
			case 2:
				System.out.println("수정할 이름 입력 >");
				String updateName = sc.next();
				Friend updateFriend = new Friend(updateName,null);
				fs.update(updateFriend);
				break;
			case 3:
				System.out.println("삭제할 이름 입력 >");
				String deleteName = sc.next();
			
				fs.delete(deleteName);
				break;
			case 4:
				System.out.println("조회할 이름 입력 >");
				String selectName = sc.next();
				
				fs.select(selectName);
				break;
			case 5:
				System.out.println("시스템종료 ");
				break;
			default :
				System.out.println("다시입력");
				break;
				
			}
			
			
			
		}
		
		
	}
}
