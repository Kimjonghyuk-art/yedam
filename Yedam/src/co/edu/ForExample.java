package co.edu;

public class ForExample {

	public static void main(String[] args) {
	
		int sum = 0;
		
		for(int i =1; i<=5; i++) {
			sum = sum +3;
		}
		
		System.out.println("sum->" + sum);
		
		
		for(int i = 1; i <=9; i++) {
			System.out.println("3 * " + i + " = " + (3*i));
		}
			System.out.println("===============");
			
		for(int i = 9; i >= 1; i--) {
			System.out.println("3 * " + i + " = " + (3*i) );
		}
			
			System.out.println("==============");
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = "+ (5*i));
		}
	
			System.out.println("==============");
			
			/*
			 * sum = 0; for(int i = 1; i <=5; i++) { sum = sum + i; }
			 * System.out.println(sum);
			 * 
			 * for(int i = 1; i <= 9; i++) { sum = sum + i; i++; }
			 */
			
			System.out.println(sum);
			sum = 0;
			for(int i = 1; i <= 10; i++) {
				if(i % 2 == 0) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
			
			
		
		
	}

}
