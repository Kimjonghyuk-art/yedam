package dimension;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		//변수 vs 배열.
		//변수 활용
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("첫번째 값 입력 >> ");
		num1 = sc.nextInt();
		System.out.println("두번째 값 입력 >> ");
		num2 = sc.nextInt();
		System.out.println("세번째 값 입력 >> ");
		num3 = sc.nextInt();
		
		// 제일 작은 수 ~ 제일 큰 수의 순으로 출력.
		
		/*
		 * if(num1 > num2) { if(num2 > num3) { System.out.println(num3 +" "+ num2 +" "+
		 * num1); } } else { if(num1 > num3) { System.out.println(num2 + " " + num3 +
		 * " " + num1); } }
		 */
		int[] arr = {num1, num2, num3};
		
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			
		}
		//System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] );
	
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			
		}
		System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] );
		
	}

}
