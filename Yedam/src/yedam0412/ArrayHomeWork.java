package yedam0412;

public class ArrayHomeWork {

	public static void main(String[] args) {
		
		
	/* 25 24 23 22 21
	 * 20 19 18 17 16
	 * 15 14 13 12 11
	 * 10 9 8 7 6 
	 * 5 4 3 2 1 
	 */
		
		int arr[][] = new int[5][5];
		int a = 1;

		for(int i = arr.length-1; i >= 0; i --) {
			for(int j = arr.length-1; j >= 0; j--) {
				arr[i][j] = a;
				a++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
