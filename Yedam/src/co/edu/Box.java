package co.edu;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		//10개씩ㄷ ㅏㅁ을수 5개씪 
		
		Scanner scn = new Scanner(System.in);
		System.out.print("오랜지 몇개 ?");
		int orange = scn.nextInt();
		
		int boxCount = orange/10;
		int boxCount5 = orange%10;
		System.out.println(" 10개씩담을 수 있는 상자  " + boxCount);
		System.out.println("남는 갯수"+ boxCount5);
		
		if(boxCount5 > 5) {
			System.out.println("5개씩 담을 수 있는 상자" + (boxCount5/5+1));
		}else if(boxCount5 <= 5) {
			int box5Count = (int)Math.ceil(boxCount5/5.0);
			System.out.println("5개씩 담을 수 있는 상자 " + box5Count);
		}

	}

}
