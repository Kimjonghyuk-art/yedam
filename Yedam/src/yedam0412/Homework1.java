package yedam0412;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		//주사위 맞추기 게임
		Scanner sc = new Scanner(System.in);
		
		int dice = (int)(Math.random()*6)+1;
		int selectNum;
		
		System.out.println(dice);
		
		while(true) {
			System.out.print("주사위 숫자 맞춰봐 >>");
			selectNum = sc.nextInt();
			
			if(selectNum <= 6 && selectNum >= 0) {
				if(selectNum > dice) {
					System.out.println("down");
				} else if(selectNum < dice) {
					System.out.println("up");
				} else if(selectNum == dice) {
					System.out.println("맞춤!");
					break;
				} 
				} else {
					System.out.println("범위초과");
			}
			
			
			
		}
		
		
	}
}
