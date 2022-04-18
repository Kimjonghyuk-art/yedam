package yedam0418.Inheritance.ex;

import java.util.HashMap;
import java.util.Scanner;

public class FriendList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, Friend> map = new HashMap<String, Friend>();

		Friend[] friends = new Friend[10];
		// friends[0] = new UnivFriend("홍길동","010-1234-1234","대구대학교","컴공");
		// friends[1] = new ComFriend("김김김","010-1344-1111","네이버","대리");
		// friends[2] = new Friend("우리집","010-1211-1211");

		while (true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("1.친구등록 2.학교친구등록 3.회사친구등록 4.돌아가기");
				int select = sc.nextInt();

				if (select == 1) {
					System.out.println("친구 등록함");
					System.out.print("이름 입력 >");
					String name = sc.next();
					System.out.print("번호 입력 > ");
					String phone = sc.next();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new Friend(name, phone);
							break;
						}
					}
					
				} else if (select == 2) {
					System.out.println("대학친구 등록함");
					System.out.print("이름 입력 >");
					String name = sc.next();
					System.out.print("번호 입력 > ");
					String phone = sc.next();
					System.out.print("대학 입력 > ");
					String univ = sc.next();
					System.out.print("전공 입력 > ");
					String major = sc.next();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new UnivFriend(name, phone,univ,major);
							break;
						} 
					}
					
				} else if (select == 3) {
					System.out.println("회사친구 등록함");
					System.out.print("이름 입력 >");
					String name = sc.next();
					System.out.print("번호 입력 > ");
					String phone = sc.next();
					System.out.print("학교 입력 > ");
					String company = sc.next();
					System.out.print("전공 입력 > ");
					String department = sc.next();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new ComFriend(name, phone,company,department);
							break;
						} 
					}
				} else if (select == 4) {
					continue;
				}

			} else if (menu == 2) {
				System.out.println("전체 조회 ");
				
				for(Friend i : friends) {
					if(i != null) {
						System.out.println(i);
						
					} 
					
				}

			} else if (menu == 3) {
				
				System.out.print("검색할 이름 입력 > ");
				String searchName = sc.next();
				
				for(int i = 0; i < friends.length; i++) {
					if(searchName.equals(friends[i].getName()) &&
							friends[i].getName() != null) {
						System.out.println(friends[i].toString());
						break;
					} 
				}

			} else if (menu == 4) {
				System.out.println("종료");
				break;
			}

		}

		/*
		 * for(Friend i : friends) { if(i != null) { System.out.println("친구 정보 : " +
		 * i.toString()); } }
		 */

		// map.put("김", new Friend("우리집","010-1211-1211"));

		// System.out.println(map.get("김"));

	}

}
