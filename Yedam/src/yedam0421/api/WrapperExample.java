package yedam0421.api;

public class WrapperExample {
	public static void main(String[] args) {
		
		//랩퍼 클래스
		//기본데이터 -> 참조데이터
		// int, long, double,
		
		int n1 = 100;
		Integer n2 = 200; //박싱 
		
		n1 = n2; //언박싱
		
		byte b1 = n2.byteValue();
		System.out.println(b1);
		
		Integer.parseInt("100");
		Double.parseDouble("123.124");
		
	}
}
