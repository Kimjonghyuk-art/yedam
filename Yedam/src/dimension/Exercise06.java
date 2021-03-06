package dimension;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		double avg = 0;
		int sum = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------");
			System.out.print("선택 >>");
			
			int selectNo = sc.nextInt();
			
			
			if(selectNo == 1) {
				System.out.print("학생수 >>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				if(scores == null) {
					System.out.println("학생 수를 지정하세요.");
					continue;
				}
				for(int i = 0; i < studentNum; i++) {
					System.out.print("점수 입력 >> ");
					scores[i] = sc.nextInt();
				}
				
			} else if (selectNo == 3) {
				if(scores == null) {
					System.out.println("학생 수를 지정하세요.");
					continue;
				} else if (scores[0] == 0) {
					System.out.println("점수를 입력하세요");
					continue;
				}
				for(int i = 0; i < studentNum; i ++) {
					System.out.print("점수 입력 조회 >> ");
					System.out.println(scores[i]);
				}
			} else if (selectNo == 4) {
				if(scores == null) {
					System.out.println("학생 수를 지정하세요.");
					continue;
				} else if (scores[0] == 0) {
					System.out.println("점수를 입력하세요");
					continue;
				}
				for(int i = 0; i < scores.length; i ++) {
					sum += scores[i];
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 >>"+ max);
				
				avg = sum/scores.length;
				System.out.println("평균: " + avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
			
		}

		System.out.println("프로그램 종료");
		
	}

}
