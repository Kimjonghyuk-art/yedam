package yedam0420.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.추 2.종");
			System.out.print("1? 2?>> ");
			int menu = 0;
		
			
			try {

				menu = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println(e);
				sc.next();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			} finally {
				System.out.println("예외 처리에서 반드시 한번은 실행됌");
			}

			if (menu == 1) {

				System.out.println("추가작업");

			} else if (menu == 2) {
				break;
			}

		}

		System.out.println("프로그램 끝");
	}
}
