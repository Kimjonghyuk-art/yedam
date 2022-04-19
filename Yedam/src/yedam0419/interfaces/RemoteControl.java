package yedam0419.interfaces;

public interface RemoteControl {

	//상수
	public static final int MAX_VOLUME = 10;
	
	
	//추상 메소드 선언
	public void turnOn();
	
	public void turnOff();
	
	public void volumeUp();
	
	public void volumeDown();
	
	public default void adjustScreen() {;
		System.out.println("화면을 조정합니다.");
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

	
}
