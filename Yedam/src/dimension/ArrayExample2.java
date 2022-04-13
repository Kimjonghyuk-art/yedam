package dimension;

public class ArrayExample2 {

	public static void main(String[] args) {

		// 학급 1 ~ 3반 
		// 1반 : 3명
		// 2반 : 4명
		// 3반 2명 
		
		int scores[][] = { {59, 63, 72}, 
						   {56, 77, 60, 23}, 
						   {23,43}
						 };
		//번쨰 반의 합계 , 평균 :
		double avg = 0;
		
		for(int i = 0; i < scores.length; i ++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				/* System.out.print(scores[i][j] + " "); */
			}
			avg = (double) sum / scores[i].length;
			System.out.println((i+1) + "번째반 합계 : " + sum + " 평균 "+ avg);
		}

	}

}
