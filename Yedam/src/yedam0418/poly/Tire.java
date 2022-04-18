package yedam0418.poly;

public class Tire {

	public int maxRotation; //타이어 수명 최대 10;
	public int accumulateRotation; //현재 사용한 누적 회전수 
	public String location; //자동차의 타이어 위치 
	
	public Tire() {
		
	}

	public Tire(int maxRotation, int accumulateRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.accumulateRotation = accumulateRotation;
		this.location = location;
	}
	
	public Tire(String location2, int maxRotation2) {
		
		this.location = location2;
		this.maxRotation = maxRotation2;
	}

	//한번 회전 시 accumulateRotation 증가 후 수명체크 메소드
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire수명 : "+ (maxRotation - accumulateRotation)
					+ "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
	
	
}
