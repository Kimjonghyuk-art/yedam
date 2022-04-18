package yedam0418.Inheritance.ex;

public class CarExample {

	public static void main(String[] args) {

		Bus bus = new Bus();
		//부모에게서 상속받은 필드, 메소드,
		bus.model = "45인승 버스";
		bus.drive();
		//자식에의 필드, 메소드 
		bus.busNo = "240번";
		bus.fee();
		System.out.println(bus.toString());
		
		
		Taxi taxi = new Taxi();
		//부모 Car의 필드와 메소드 사용 가능
		taxi.model = "택시 모뒐";
		taxi.drive();
		//자기 자신의 필드, 메소드
		taxi.type = "개인택시";
		taxi.metering();
		System.out.println(taxi.toString());
		
		//자식 클래스의 인스턴스 -> 부모 참조변수 할당가능.
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		
		Car[] cars = new Car[10];
		cars[0] = bus; //  자동 형변한 
		cars[1] = taxi;
		
		
		
		
		
		
		
	}

}
