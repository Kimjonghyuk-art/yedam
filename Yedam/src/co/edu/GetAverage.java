package co.edu;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		//입력값을 num1, num2, num3 
		Scanner scn = new Scanner(System.in);
		
		int num1,num2,num3;
		double avg;
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = scn.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = scn.nextInt();
		System.out.print("세번째 정수 입력 : ");
		num3 = scn.nextInt();

		avg = (num1+num2+num3)/3.0;
		
		System.out.println("평균은 : " + avg + "입니다.");
		
		System.out.printf("입력한 세 값은 %d, %d, %d 이고 평균은 %3f "
				,num1,num2,num3,avg );
	}

}
