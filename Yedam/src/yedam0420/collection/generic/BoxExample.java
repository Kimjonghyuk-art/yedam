package yedam0420.collection.generic;

import java.util.ArrayList;

import yedam0418.Inheritance.ex.Friend;

public class BoxExample {
	public static void main(String[] args) {
	
		
		Box<String> box = new Box<String>();
		
		box.setField("Orange");
		
		String result = (String) box.getField(); // 리턴되는 타입이 오브젝트 이므로 형변환 필요
		System.out.println(result);
		
		Box<Integer> box2 = new Box<Integer>();
		
		box2.setField(123123);
		Integer result2 = (Integer) box2.getField();
		System.out.println(result2);
		System.out.println("-----------------------");
		ArrayList<String> arraylist = new ArrayList<String>();
		
		arraylist.add(result);
		arraylist.add("owiehfoiawefoianwefoin");
		
		for(String i : arraylist) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		
		friends.add(new Friend("김김김김김","010-1111-1111"));
		friends.add(new Friend(result,result));
		
		for(Friend i : friends) {
			System.out.println(i);
		}
		
		
		
		
	}
	
}
