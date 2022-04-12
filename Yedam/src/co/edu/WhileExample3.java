package co.edu;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// 랜덤 1~10 범위
		// 입력값 담는 변수
		//while 구문 사용 임의의 값과 입력값이 같으면 종료 

		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random()*10) +1;
		System.out.println(ran);
		while(true) {
			
			System.out.println("숫자 입력 >> ");
			int userVal = sc.nextInt();
			
			if(userVal > ran) {
				System.out.println("down");
				continue;
			} else if(userVal < ran) {
				System.out.println("up");
				continue;
			} else if(userVal == ran) {
				System.out.println("입력값 : " + userVal);
				System.out.println("랜덤값 : " + ran);
				System.out.println("종료.");
				System.exit(0);
			}
			
		}
		
		
		
		
	}

}
