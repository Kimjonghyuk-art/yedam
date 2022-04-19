package yedam0419.collection;

import java.util.Scanner;

import yedam0418.Inheritance.ex.Friend;
//배열의 기능 활용.
public class FriendServiceArray implements FriendService {
	Scanner sc = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	
	@Override
	public void insert(Friend friend) {
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
			}
		}
		
	}

	@Override
	public void update(Friend friend) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].getName().equals(friend.getName())) {
				
				System.out.print(friends[i].getName()+"의 수정할 번호 입력 >");
				String updateNum = sc.next();
				friends[i].setPhoneNum(updateNum);
				System.out.println("수정 완료");
				break;
			} else {
				System.out.println("입력한 이름이 없음");
			}
		}
		

	}

	@Override
	public void delete(String name) {
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			} else {
				System.out.println("이름이 없음 ");
			}
		}
		

	}

	@Override
	public Friend select(String name) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				System.out.println(friends[i]);
				break;
			}
		}
		return null;
	}

}
