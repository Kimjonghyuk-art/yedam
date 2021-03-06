package yedam0419.collection;

import java.util.ArrayList;
import java.util.Scanner;

import yedam0418.Inheritance.ex.Friend;
import yedam0418.Inheritance.ex.Gender;

//ArrayList 컬렉션 활용 
public class FriendServiceList implements FriendService {
	Scanner sc = new Scanner(System.in);
	ArrayList<Friend> friendlist = new ArrayList<Friend>();

	@Override
	public void insert(Friend friend) {
		friendlist.add(friend);
	}

	@Override
	public void update(Friend friend) {
		
		for(int i = 0; i <friendlist.size(); i++) {
		//	Friend vo = (Friend)friendlist.get(i);
			if(friendlist.get(i).getName().equals(friend.getName())) {
				System.out.print("수정할 번호 입력> ");
				String updateNum = sc.next();
				friendlist.get(i).setPhoneNum(updateNum);
				System.out.println("수정 완료");
				break;
			}
		}
		
		System.out.println("수정할 번호 입력 >");
	}

	@Override
	public void delete(String name) {

		for(int i = 0; i < friendlist.size(); i++) {
			//Friend vo = (Friend)friendlist.get(i);
			if(friendlist.get(i).getName().equals(name)) {
				friendlist.remove(i);
				System.out.println("삭제 완료");
			} else {
				System.out.println("조회할 이름이 없음 ");
			}
		}
		
	}
	
	@Override
	public Friend select(String name) {
	
		for(int i = 0; i < friendlist.size(); i++) {
			//Friend vo = (Friend)friendlist.get(i);
			
		if(friendlist.get(i).getName().equals(name)) {
			System.out.println(friendlist.get(i).toString());
		} else {
			System.out.println("조회할 이름이 없음 ");
		}

		}

		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		for(int i = 0; i < friendlist.size(); i++) {
			//열거형 타입은 .equals 대신에 == 씀 
			if(friendlist.get(i).getGender() == gender) {
				list.add(friendlist.get(i));
			}
		}
		return list;
	}
	

}
