package home.work0415;

class Point {
	private int x, y;
	
	public Point() { 
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) { // 값 저장 
		this.x = x; this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point { // point를 상속받은 ColorPoint 선언
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print (color);
		showPoint(); //Point 클래스의 showPoint() 호출
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(5, 6, "red"); //ColorPoint 생성자 호출
		cp.showColorPoint();
		
		
	}
}
