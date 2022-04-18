package yedam0418.Inheritance.ex;

import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {

		// 5가 들어있는 위치를 찾는 게임

		Scanner sc = new Scanner(System.in);

		int[] random = new int[5];

		for (int i = 0; i < random.length; i++) {
			int ran = (int) (Math.random() * 5) + 1;
			random[i] = ran;
			for (int j = 0; j < i; j++) {

				if (random[i] == random[j]) {
					i--;
				}
			}
		}

		while (true) {

			System.out.print("\n 5위치 입력 >");
			int select = sc.nextInt();

			if (random[select - 1] == 5) {
				System.out.println("같음");
				break;
			} else {
				System.out.println("다름");
			}

			for (int i = 0; i < random.length; i++) {
				int[] set = new int[5];
				
				if (i == select - 1) {
					set[i] = random[select-1];
				} 
				
				if(set.length > 0) {
					System.out.print("[" + set[select-1] + "]");
				} else if (i != select - 1) {
					System.out.print("[*]");
				}

			}

		}

	}

}
