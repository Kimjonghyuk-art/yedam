package yedam0413;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		int intArray[] = {10,20,30,40,50};
		int max = 0;
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		
		System.out.println("최대값>> "+max);
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		System.out.println("총합>> " + sum);
		
	}

}
