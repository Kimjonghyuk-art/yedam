package yedam0418.poly;
//추상 클래스 abstract 선언 
public abstract class Animal {

// Animal() 생성자로 인스턴스 생성 X.

	public Animal() {
	
	}
	
	public abstract void eat(); //강제로 eat() 구현하도록 함
	public abstract void move();
	
	public void sleep() {
		System.out.println("Zzz...zZz...Zzz.....zzZ..");
	}
}
