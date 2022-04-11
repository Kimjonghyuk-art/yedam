package co.edu;

import java.util.Scanner;

public class Scannerex {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int num1,num2,num3;
		int sum;
		double avg;
		int high;
		System.out.print ("점수를 입력하세요:");
		num1 = scn.nextInt();
		System.out.print ("점수를 입력하세요:");
		num2 = scn.nextInt();
		System.out.print ("점수를 입력하세요:");
		num3 = scn.nextInt();
		
		sum = num1+num2+num3;
		avg = (num1+num2+num3) / 3.0;
		
		if(num1 > num2) {
			high = num1;
		}else if(num2 > num3) {
			high = num2;
		}else {
			high = num3;
		}
		
		
		System.out.println("합은 : " + sum + "이고 평균은 " + avg + "이고" +
		"최고 점은 " + high);

		System.out.printf("합은 %d 평균은 %.2f 최고 점은 %d", sum , avg, high);
		
		
	}

}
