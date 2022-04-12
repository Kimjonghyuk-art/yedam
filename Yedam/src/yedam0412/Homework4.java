package yedam0412;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 임의의 입력값 1 가위 2 바위 3 보
		// 사용자 입력값 1 가위 2 바위 3
		// 이기는 경우 1 =2 2=3 3=1
		// 이외의 경우는 짐

		String result = "";
		String result2 = "";
		int userNum;

		while (true) {
			int ranNum = (int) (Math.random() * 3) + 1;
			System.out.println(ranNum);
			System.out.print("1(가위) 2(바위) 3(보) 입력 >>");
			userNum = sc.nextInt();

			if (ranNum == 1) {
				result = "가위";
			} else if (ranNum == 2) {
				result = "바위";
			} else if (ranNum == 3) {
				result = "보";
			}
			if (userNum == 1) {
				result2 = "가위";
			} else if (userNum == 2) {
				result2 = "바위";
			} else if (userNum == 3) {
				result2 = "보";
			}
		
			if ((userNum == 1 && ranNum == 3) || (userNum == 2 && ranNum == 1) || (userNum == 3 && ranNum == 2)) {
				System.out.print("상대: " + result + " 유저 : " + result2);
				System.out.println(" you win!");

			} else {
				System.out.println("상대: " + result + " 유저 : " + result2 + " you lose");
			}

		}

	}

}
