package co.edu;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int f;
		double c;
		
		System.out.print("화씨 온도를 입력 : ");
		f = scn.nextInt();
		c = (f-32)/1.8;
		System.out.printf("섭씨 온도는 %.1f 입니다.",c );
		
		double test = (double)5/9*(f-32);
		System.out.println(test);
		
	}

}
