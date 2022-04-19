package yedam0419.interfaces;

public class RemoteExample {
	public static void main(String[] args) {
		
		//상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.
		//
		
		Television tv = new Television();
		Audio audio = new Audio();
		
		RemoteControl rc = new Television();

		rc.turnOff();
		tv.turnOn();
		audio.turnOff();
		
		rc = new Audio();
		
		rc.turnOff();
		
	}
}
