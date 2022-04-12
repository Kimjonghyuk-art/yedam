package co.edu;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		int sum = 0;
		
		// sum이 200이 넘게 되면 반복문 종료 
		while(isTrue) {
		
			System.out.print("값을 입력 >> ");
			int i = sc.nextInt();
			
			sum += i;
			
			if(sum >= 200) {
				System.out.println("현재 값" + sum);
				System.out.print("반복문을 종료 합니다.");
				isTrue = false;
				continue;
			}
		}
		

	}

}
