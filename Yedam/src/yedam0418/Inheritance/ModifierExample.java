package yedam0418.Inheritance;

import yedam0418.Inheritance.ex.Friend;

class Friend2 extends Friend {
	
	public Friend2() {
		super(); // 생성자 호출
		this.getName(); // protected 메소드
		//this.getPhoneNum(); default 메소드  
	}
	
}

public class ModifierExample {
	public static void main(String[] args) {
		
		//오류 발생
		//Friend friend = new Friend();
		
		
		
	}
}
