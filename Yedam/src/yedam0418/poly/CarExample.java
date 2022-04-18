package yedam0418.poly;

public class CarExample {

	public static void main(String[] args) throws InterruptedException {

		Car car = new Car();
		
		for(int i = 0; i < 8; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 재생타이어로 교체합니다.");
				car.frontLeft = new Tire(3,0,"앞 왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 중고타이어로 교체합니다.");
				car.frontRight = new Tire(5,0,"앞 오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 한국타이어로 교체합니다.");
				car.backLeft = new HankookTire("뒤 왼쪽 ", 12);
				break;
			case 4:
				System.out.println("뒤 오른쪽 금호타이어로 교체합니다.");
				car.backRight = new KumhoTire("뒤 오른쪾", 15);
				break;
			}
			Thread.sleep(1000);
			System.out.println("--------------------------------------");
			
		}
		

	}

}
