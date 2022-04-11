package co.edu;

import java.util.Scanner;

public class OperatorExample {
	public static void main(String[] args) {
		
		// 나머지 %
		/*
		 * int result = 6/4; int result2 = 6%4; System.out.println(result);
		 * System.out.println(result2);
		 * 
		 * int val = 5;
		 * 
		 * if (val % 2 == 0) {
		 * 
		 * System.out.println("짝수"); } else { System.out.println("홀수"); }
		 */
		
		
		//75300 원 5만원 => 
		int won = 75300;
		int oman = 50000;
		int man = 10000;
		int chon = 1000;
		int ochon = 5000;
		int obeck = 500;
		int beck = 100;;
		int result22 = 0;
		int result33 = 0;
		
	
		
		if (won / oman > 0) {
			result22 = won/oman;
			System.out.println("5만원 권 = " + result22 );
			result33 = won%oman;
		}
		
		System.out.println(result22 );
		System.out.println(result33 );
		
		if(result33 / man > 0) {
			result22 = result33/man;
			System.out.println("1만원 권 = " + result22);
			result33 = result33%man;	
		}
		
		if(result33 / chon > 0) {
			result22 = result33/chon;
			System.out.println("천원 권 = " + result22);
			result33 = result33%chon;
		}
		
		if(result33 / obeck > 0) {
			result22 = result33/obeck;
			System.out.println("오백원 = " + result22);
			result33 = result33%obeck;
		}
		
		if(result33 / beck > 0) {
			result22 = result33/beck;
			System.out.println("백원 = " + result22);
			result33 = result33%beck;
		}
		
		
		/*
		 * int money = 75300; int m1=(int)(money/10000);//만원권 int
		 * m2=(money%10000)/5000;//오천원권 int m3=(money%5000)/1000;//천원권 int
		 * m4=(money%1000)/500;//오백원권 int m5=(money%500)/100;//백원권
		 * System.out.println("금액 : "+money);
		 * System.out.println("만원권: "+m1+", 오천원권: "+m2+", 천원권: "+
		 * m3+", 오백원권: "+m4+", 백원권: "+m5);
		 */
	        Scanner scn = new Scanner(System.in);
	        
	        int money;
	        
	        System.out.println("돈 입력 >>");
	        money = scn.nextInt();
	        int m1=(int)(money/10000);//만원권
	        int m2=(money%10000)/5000;//오천원권
	        int m3=(money%5000)/1000;//천원권
	        int m4=(money%1000)/500;//오백원권
	        int m5=(money%500)/100;//백원권
	        
	    
	        
	        System.out.println("금액 : " + money);
	        System.out.println("만원권: "+m1+", 오천원권: "+m2+", 천원권: "+
	        m3+", 오백원권: "+m4+", 백원권: "+m5);
	        
	        
	        
	        
	        
	        
	}

}
