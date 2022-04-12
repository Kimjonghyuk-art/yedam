package yedam0412;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = "";
		String com = "";
		while(true) {
			int ran = (int)(Math.random()*3)+1;
			if(ran == 1) {
				com = "가위";
			} else if(ran == 2) {
				com = "바위";
			} else if(ran == 3) {
				com = "보";
			}
			System.out.print("가위, 바위, 보 입력 >>");
			user = sc.next();
			
			if(!user.equals("가위") && !user.equals("바위") && 
					!user.equals("보")) {
				System.out.println("다시 입력하세요.");
			}
			if(com.equals("가위")) {
				if(user.equals("가위")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
				+ user + " 비겼습니다.");
				}else if(user.equals("바위")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
							+ user + " 이겼습니다.");
				}else if(user.equals("보")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
							+ user + " 졌습니다.");
				}
			} else if(com.equals("바위")) {
				if(user.equals("가위")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
				+ user + " 졌습니다..");
				}else if(user.equals("바위")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
							+ user + " 비겼습니다.");
				}else if(user.equals("보")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
							+ user + " 이겼습니다.");
				}
			} else if(com.equals("보")) {
				if(user.equals("가위")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
				+ user + " 이겼습니다.");
				}else if(user.equals("바위")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
							+ user + " 졌습니다.");
				}else if(user.equals("보")) {
					System.out.println("컴퓨터 : "+ com+" 사용자 : " 
							+ user + " 비겼습니다.");
				}
			}
			
		}
		

	}

}
