package yedam0415;

public class Singleton {

	//필드에 클래스 객체 생성 
	private static Singleton singleton = new Singleton();

	//접근지정자를 private로 생성자 선언
	private Singleton() {
		
	}

	//getInstance로 클래스 객체를 반환 
	public static Singleton getInstance() {
		return singleton;
	}
	
}
