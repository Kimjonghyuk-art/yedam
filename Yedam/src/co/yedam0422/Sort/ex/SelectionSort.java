package co.yedam0422.Sort.ex;

public class SelectionSort {

	private int i;
	private int j;
	private int min;
	
	public void sort(int[] arr) {
		//초기 데이터 출력
		arrPrint(arr);
		
		for(i = 0; i < arr.length-1; i++) {
			min = i;
			for(j = i + 1; j < arr.length; j++) { //요소 비교
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		resultPrint(arr);
	}

	private void resultPrint(int[] arr) {
		System.out.println("======== 결과 데이터 ========");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===========================");
		
	}
		
	

	private void arrPrint(int[] arr) {
		System.out.println("======== 초기 데이터 ========");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===========================");
		
	}

}
