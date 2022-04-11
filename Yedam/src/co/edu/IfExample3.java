package co.edu;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
	
		int num1, num2;

		System.out.println("첫번쨰 정수를 입력하시오.");
		num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하시오.");
		num2 = scn.nextInt();
		

		//큰 수에서 작은 수를 뺸 결과 값을 result에 적용
		int result;
		
		if(num1 > num2) {
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" +result);
		}else {
			System.out.println(num1 + "은 " + num2 + "보다 작습니다." );
		}
		
	
		
		
	}
}
