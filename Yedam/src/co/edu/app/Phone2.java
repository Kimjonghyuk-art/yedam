package co.edu.app;

interface PhoneSystem {
	public void printLogo();
	public void On();
}
class SamsungPhone implements PhoneSystem {
	@Override
	public void printLogo() {
		System.out.println("삼성 폰!");
	}
	@Override
	public void On() {
		System.out.println("삼성폰 켜짐!");
	}
}
class LGPhone implements PhoneSystem {
	@Override
	public void printLogo() {
		System.out.println("엘지폰 로고!");
	}
	@Override
	public void On() {
		System.out.println("엘지폰 켜짐!");
	}
	
}

public class Phone2 {
	public static void main(String[] args) {
		//인터페이스에 선언되어진 메소드는 상속받은 클래스에서 작성이 강제된다.
		//이 특성을 이용해 같은 기능이지만 서로다른 내용물을 가진 (여기선 출력문)
		//삼성폰과 엘지폰을 하나의 인터페이스에 담아 줄 수 있음.
	
		//인터페이스이름 변수명 new 상속받은클래스명
		//PhoneSystem ps = new SamsungPhone();
		PhoneSystem ps = new LGPhone();
		ps.printLogo();
		ps.On();
		
	}

}
