package co.yedam0422.Sort.ex;

import java.util.Arrays;

public class MainApp {
	public static void main(String[] args) {

		SelectionSort selectSort = new SelectionSort();
		
		int arr[] = { 5, 1, 4, 3, 2 };
		//System.out.print("기본 데이터 > ");
		//for(int i : arr) {
		//	System.out.print(i + " ");
		//}
	//	System.out.println();
		
		selectSort.sort(arr);
		
		//Arrays.sort(arr);
				
	}
}
