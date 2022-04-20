package yedam0420.collection.generic;

import yedam0420.collection.generic.Outer.Inner2;

public class OuterMain {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.method1();
		
		//instance 멤버 클래스 
		Outer.Inner1 inner = outer.new Inner1();
		
		//static 멤버 클래스
		Outer.Inner2.method5();
		
		Outer.Inner2 inner2 = new Inner2();
		inner2.method4(); // 인스턴스 메소드 
		inner2.method5(); // 정적 메소드 
		
	}

}
