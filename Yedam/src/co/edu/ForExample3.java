package co.edu;

public class ForExample3 {

	public static void main(String[] args) {
		
		//1 ~ 100 번 반복
		//최초로 1000보다 큰 값이 되면 
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 1000) {
				System.out.println("순번 : " + i);
				System.out.println(sum);
				break;
			}
		}
		
		
		// 1~ 10번을 반복
		// sum = sum * 1
		sum = 1;
		for(int i = 1; i <= 10; i++) {
			sum = sum*i;
			System.out.println(sum);
		}
		
		
		// 숫자 100의 약수를 구하는 프로
		
		sum = 100;
		for(int i = 1; i <= 100; i++) {
			if(sum % i == 0) {
				System.out.println(i+"는 100의 약수 입니다.");
			}
		}
		
		
		
		
	}

}
