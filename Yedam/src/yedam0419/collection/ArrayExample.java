package yedam0419.collection;

import java.util.ArrayList;

import yedam0418.Inheritance.ex.Friend;

//배열 vs. 컬렉션
//배열활용한 프로그램, 컬렉션을 활용한 프로그램
//인터페이스 선언 => 구현하는 클래스,
public class ArrayExample {
	public static void main(String[] args) {
		//배열은 크기 변경 불가 지정된 값으로만 사용
		Friend[] friend = new Friend[10];
		friend[0] = new Friend("홍홍","111-1111-1111");
		friend[1] = new Friend("박박","222-2222-2222");
		friend[0] = null;
		/*
		 * for(int i = 0; i < friend.length; i++) { if(friend[i] != null) {
		 * System.out.println(friend[i].toString()); } }
		 */
		
		
		//컬렉션을 활용 인터페이스 => List: 컬렉션 =>ArrayList 
		
		ArrayList<Friend> friendlist = new ArrayList<Friend>();
			
			friendlist.add(new Friend("어레이리스트","어뤠위뤼쉬튀"));
			friendlist.add(new Friend("어2레2이2리2스2트2","어2뤠2위2뤼2쉬2튀2"));
			friendlist.add(new Friend("33333","33333"));
			friendlist.remove(2);
			
			for(Friend i : friendlist)
			System.out.println(i);
			
			
			for(int i = 0; i < friendlist.size(); i++) {
				System.out.println(friendlist.get(i));
			}
			
			Friend f2 = (Friend)friendlist.get(0); //get(index) -> object타입 반환
			
			System.out.println(f2);
			
			
			
		
	}
}
