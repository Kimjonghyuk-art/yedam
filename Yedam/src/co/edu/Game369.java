package co.edu;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num;
		System.out.println("1~99까지의 정수를 입력 하시오");
		num = scn.nextInt();
		
		if(num != 0 && num>=1 && num <=99 ) {
			int a,b;
			a = num/10; //10의 자리
			b = num%10; //1의 자리
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println("박수짝짝");
			}else if ((a==3 || a==6 || a==9) || (b==3 || b==6 || b==0 )) {
				System.out.println("박수짝");
			}else {
				System.out.println("숫자의 범위를 초과했습니다.");
			}
			
			
			
		}
		
		
		
		
	}

}
