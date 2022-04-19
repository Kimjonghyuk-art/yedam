package yedam0419.interfaces;
//인터페이스를 구현클래스 통해 구현 
public class Television implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println(" TV 전원 킵니당");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원 끕니당.");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("TV 볼룸 업 ");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("TV볼륨 다우우운");
		
	}

	@Override
	public void adjustScreen() {
	
		//RemoteControl.super.adjustScreen();
		System.out.println("TV의 화면을 조정합니다.");
	}
	
	
}
