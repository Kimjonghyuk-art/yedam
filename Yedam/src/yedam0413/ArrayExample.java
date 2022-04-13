package yedam0413;

public class ArrayExample {

	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		
		/*
		 * int num = 10;
		 * 
		 * for(int i = 0; i < intArray.length; i++) { System.out.println(intArray[i]); }
		 * 
		 * for(int i = 0; i < intArray.length; i++) { intArray[i] += num;
		 * System.out.println(intArray[i]); }
		 */
		
		
		int otherArray[] = {10,20,30,40,50};
		
		for(int i = 0; i < otherArray.length; i++) {
			System.out.println(otherArray[i]);
		}
		
		
		if(intArray == otherArray) {
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
		
		if(intArray[0] == otherArray[0]) {
			System.out.println("same value");
		} else {
			System.out.println("different value");
		}
		
		
		
		
		
		
	}

}
