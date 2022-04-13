package yedam0413;

public class ReferenceExam {

	public static void main(String[] args) {

		//기본타입 
		int num1 = 100;
		int num2 = 100;
		
		if(num1 == num2) {
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
		

		//참조타입
		String str1 = new String("Gil Dong"); //인스턴스
		String str2 = new String("Gil Dong"); // 인스턴스
		
		if(str1 == str2) { // 참조 변수 == 주소값으로 비교하기 다름
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
		
		if(str1.equals(str2)) { // 문자열 값을 비교하는 메소드
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}		
		
		String str3 = "gong";
		String str4 = "gong";
		
		if(str3 == str4) { 
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
				
		
		str1 = null;
		System.out.println(str1);
		str1 = "dong dong";
		System.out.println(str1);
		
		
		
		
	}

}
