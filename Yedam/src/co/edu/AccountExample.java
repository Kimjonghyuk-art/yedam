package co.edu;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int balance = 0;
		int money = 0;
		boolean run = true;

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 2.출금 3.조회 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>>>>");
			int menuSelectNum = sc.nextInt();

			switch (menuSelectNum) {

			case 1: // 예금기능
				System.out.print("예금액 >>>");
				money = sc.nextInt();
				balance += money;
				System.out.println("입금완료");
				break;
			case 2: // 출금기능
				System.out.print("출금액 >>");
				money = sc.nextInt();
				if (balance > money) {
					balance -= money;
					System.out.println("출금 완료");
				} else if (balance < money) {
					System.out.println("잔액이 부족합니다.");
				}
				break;

			case 3: // 조회기능
				System.out.print("잔고 >>>" + balance + "\n");
				break;

			case 4: // 종료
				System.out.println("종료 합니다.");
				run = false;
				break;

			default:
				System.out.println("잘못 된 메뉴를 선택 했습니다.");
				continue;

			}

		}

		System.out.println("프로그램 종료.");

	}

}
