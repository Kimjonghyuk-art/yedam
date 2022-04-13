package yedam0412;

public class ArrayHomeWork2 {

	public static void main(String[] args) {
		
		//4x4 2차원 배열 만듥
		// 1~10 랜덤
		// 출력
		
		int arr[][] = new int[4][4];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int ran = (int)(Math.random()*10 + 1);
				arr[i][j] = ran;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
