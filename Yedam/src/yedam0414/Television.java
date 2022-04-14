package yedam0414;
//객체 -> 도면 -> 텔레비전(삼성, 엘지)

// Object -> Class -> Instance
//추상화(텔레비전의 모든 속성 -> 필요한 부분)

public class Television {
	// 속성

	String company;
	String model;
	int price;
	String color;

	// 기능

	void turnOn() {
		System.out.println("텔레비전을 킵니다.");
	}

	void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	void changeChanel(int chanel) {
		System.out.println(chanel + "번의 채널로 바꿈");
	}

}
