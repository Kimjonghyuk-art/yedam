package yedam0413;

public class ForExample {

	public static void main(String[] args) {

		// 주사위 게임 2개 던짐

		// 2개의 숫자로 합이 6이 되는 경우
		/*
		 * int cnt = 0; while (true) { int dice = (int) (Math.random() * 6) + 1; int
		 * dice2 = (int) (Math.random() * 6) + 1; if (dice + dice2 == 6) {
		 * System.out.println("첫번째 주사위 : " + dice + " 두번쨰 주사위" + dice2); cnt++; }
		 * 
		 * if(cnt > 12) { break; } }
		 */
		
		int dice[] = {1,2,3,4,5,6};
		int dice2[] = {1,2,3,4,5,6};
		
		for(int i = 0; i < dice.length; i++) {
			
			for(int j = 0; j < dice.length; j++) {
				if(dice[i] + dice2[j] == 6) {
					System.out.println("첫번쨰 주사위 : " + dice[i] + "두번쨰 주사위 : " + dice2[j]);
				}
			}
			
		}
		
		for(int i = 1; i <= 6; i++) {
		
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		
		
		
	}

}
