package yedam0418.Inheritance;

public class InheritExample {
	public static void main(String[] args) {
	
		Child1 c1 = new Child1();
		
		System.out.println(c1.field1);//부모 (Parant) 필드
		System.out.println(c1.field2); //자식 Child1 필드
		
		c1.method1();
		c1.method2();
		
		Child2 c2 = new Child2();
		
		System.out.println(c2.field1);
	//	System.out.println(c2.field3);
		
		c2.method1();
		c2.method3(); 
		
		//부모의 참조변수에 자식 인스턴스를 할당
		Parent p1 = new Parent();
		p1 = new Child1(); 
		p1 = new Child2(); // 자동 형변환 업캐스팅
		
		p1.field1 = ""; //부모가 가진 필드,메소드 
		
		c2 = (Child2) p1; // 강제 형 변환 다운캐스팅
		
		c2.field1 = "";
		c2.field13 = "";
		
		c2.method1();
		c2.method3();
		
		
	}
}
