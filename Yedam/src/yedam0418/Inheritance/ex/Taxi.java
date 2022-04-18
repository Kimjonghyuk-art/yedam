package yedam0418.Inheritance.ex;

public class Taxi extends Car {

	//필드
	String type; // 개인 택시, 회사택시, 
	
	//생성자
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");
	}
	
	//메소드
	public void metering() {
		System.out.println("요금 계기판");
	}
	
	@Override
	public void drive() {
		System.out.println("택시가 운행을 합니다.");
	}
	
	
	@Override
	public String toString() {
	
		return "택시의 종류는 " + type;
	}
	
}
