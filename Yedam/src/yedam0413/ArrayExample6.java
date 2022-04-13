package yedam0413;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String names[] = new String[3];
		int scores[] = new int[3];
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.print("학생 이름 입력 >> ");
			names[i] = sc.nextLine();
			
			System.out.print("학생 점수 입력 >> ");
			scores[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.print("조회할 학생의 이름 입력 >> ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < names.length; i++) {
			
			if(searchName.equals(names[i])) {
				System.out.println(names[i] + "의 점수는 " + scores[i] + " 점 입니다.");
			}
		}
		
		System.out.println("end of prog.");

	}

}
