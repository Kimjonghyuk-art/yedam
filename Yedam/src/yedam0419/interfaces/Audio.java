package yedam0419.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio 전원 킵");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 전원 끔");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Audio 볼륨업 ");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio 볼륨 다운 ");
		
	}

}
