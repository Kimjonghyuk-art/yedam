package co.edu;

public class NestedExample {

	public static void main(String[] args) {

		// 구구단 출력

		int dan;
		for (int j = 2; j <= 9; j++) {
			dan = j;

			for (int i = 1; i <= 9; i++) {
				// System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <=5; i++) {
			for(int j = 5; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
