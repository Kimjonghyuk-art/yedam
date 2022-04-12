package co.edu;

public class ForExample2 {

	public static void main(String[] args) {
		//1 ~ 100 반복 
		// 31 번째 종료 코드 추가 
		int sum = 0;
		
		for(int i = 1; i <=100; i++) {
			sum += i;
			
			if(i == 31) {
				System.out.println("i 값 :"+i);
				System.out.println("종료 함");
				System.exit(0);
			}
			System.out.println(sum);	
		}
		
		
		
		
		
	}

}
