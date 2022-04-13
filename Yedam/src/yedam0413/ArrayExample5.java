package yedam0413;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 학생 다섯 명의 수학 점수를 담을 수 있도록 배열

		int scores[] = new int[5];
		int sum = 0;
		int max = 0;
		int min = 100;
	
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번째 학생 점수 입력 >> ");
			scores[i] = sc.nextInt();
			if (max < scores[i]) {
				max = scores[i];

			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.println("최고점 : " + max);
		System.out.println("최하점 : " + min);

		
		
		
	}

}
