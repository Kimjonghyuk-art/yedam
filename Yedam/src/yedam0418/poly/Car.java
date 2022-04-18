package yedam0418.poly;

public class Car {

	Tire frontLeft = new Tire(6,0,"앞왼쪽");
	Tire frontRight = new Tire(2,0,"앞오른쪽");
	Tire backLeft = new Tire(3,0,"뒤 왼쪽");
	Tire backRight = new Tire(4,0,"뒤 오른쪽");
	
	public int run() {
		System.out.println("자동차가 달랍니다");
		
		
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(backLeft.roll() == false) {
			stop();
			return 3;
		}
		if(backRight.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
		
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
}
