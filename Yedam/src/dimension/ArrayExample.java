package dimension;

public class ArrayExample {

	public static void main(String[] args) {
		/*
		 * int arr[][] = new int[4][3];
		 * 
		 * arr[0][0] = 10; arr[1][0] = 20; arr[3][2] = 100;
		 * 
		 * 
		 * for(int i = 0 ; i < arr.length; i++) { for(int j = 0; j < arr[j].length; j++)
		 * { //System.out.print(arr[i][j]+" "); } //System.out.println(); }
		 * 
		 * 
		 * int arr1[][] = new int[4][4]; int cnt = 1; for(int i = 0 ; i < arr1.length;
		 * i++) { for(int j = 0; j < arr1[i].length; j++) { arr1[i][j] += cnt; cnt++;
		 * System.out.print(arr1[i][j] + " "); if(arr1[i][j] % 5 == 0) {
		 * System.out.println(); } } }
		 * 
		 * int arr2[][] = new int[5][5]; int cnt2 = 1;
		 * 
		 * for(int i = 0; i < arr2.length; i ++) { for(int j = 0; j < arr2[i].length;
		 * j++) { arr2[i][j] += cnt2++; //System.out.print(arr2[i][j] + " "); }
		 * System.out.println(); }
		 */

		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25

		int arr3[][] = new int[5][5];
		int a = 1;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[j][i] = a++;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

		
		
		
	}

}
