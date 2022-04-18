package yedam0418.Inheritance.ex;

public class Bus extends Car{

	//필드
	String busNo; 
	//생성자
	public Bus() {
		super(); // 부모자식의 관계 super-> 부모
		System.out.println("Bus() 생성자 호출 ");
	}
	//메소드
	public void fee() {
		System.out.println("요금을 받숩니다.");
	}

	@Override
	public void drive() {
		System.out.println("버스 drvie()메소드 실행 - > 버스가 운행을 합니다.");
	}
	

	@Override
	public String toString() {

		return super.toString();
	}
	
}
