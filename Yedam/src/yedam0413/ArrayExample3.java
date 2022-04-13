package yedam0413;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		int Array[] = {78, 49, 30, 30, 93, 80, 50};
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < Array.length; i++) {
			sum += Array[i];
			
		}
		avg = sum/Array.length;
		
		System.out.println("합계 > " + sum);
		System.out.println("평균 >> " + avg);
		
		sum = 0;
		avg = 0;
		int sumCount = 0;
		for(int i = 0; i < Array.length; i++) {
			
			if(i % 2 == 1) {
				System.out.println(Array[i]);
				sum += Array[i];
				sumCount++;
			}
		}
		System.out.println(sumCount);
		avg = sum/sumCount;
		System.out.println("합계 >> " + sum);
		System.out.println("평균 >> " + avg);
		sum = 0;
		avg = 0;
		for(int i = 0; i < Array.length; i++) {
			if(Array[i] % 2 == 0) {
				sum += Array[i];
			}
		}
		System.out.println("합계 >>" + sum);
		
		
	}

}
