package co.edu;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		sum = 0;
		while(isTrue) {
			System.out.print("숫자 입력,종료하려면 -1 입력 >>");
			int temp = sc.nextInt();
			if(temp == -1) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("입력 값의 합은 " + sum);
		
	}

}
