package yedam0419.interfaces;
//구현 클래스 클래스명
//메소드 1개 함수처럼 사용 
interface Runnable {
	public void run();
	
}

class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("움직입니다.");
	}

}


public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		
		//익명 구현객체
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("멍멍이가 달륍니다.");
			}

		};
		runnable.run();
		
		//익명구현객체, 람다표현식 
		runnable = () -> {
				System.out.println("야옹이가 달륍니다.");
		};
		runnable.run();
		
	}
	
}
