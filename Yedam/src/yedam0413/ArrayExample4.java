package yedam0413;

public class ArrayExample4 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			int ran = (int)(Math.random()*30)+1;
			arr[i] = ran;
			System.out.println(arr[i]);
			
			if(arr[i] >= 15) {
				sum += arr[i];
				cnt++;
			}
		}
		avg = sum/cnt;
		
		System.out.println("15보다 큰 합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		

	}

}
