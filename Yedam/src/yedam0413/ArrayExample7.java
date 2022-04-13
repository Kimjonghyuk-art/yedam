package yedam0413;

public class ArrayExample7 {

	public static void main(String[] args) {
		
		int month = 5;
		int num = getLastDay(month);
		String[] days = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for(int i = 0 ; i < days.length; i ++) {
			System.out.printf("%5s", days[i]);
		}
		
		int spc =getDayInfo(month);
		
		for(int i = 0; i < spc; i ++) {
			System.out.printf("%5s"," ");
		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {	
			System.out.printf("%5d", arr[i]);
			if((spc+i) % 7 == 6) {
				System.out.println();
			}
		}
		
	}

	public static int getLastDay(int month) {
		
		switch(month) {
		case 4 :
			return 30;
		case 5 : 
			return 31;
		case 6 : 
			return 30;
		default: 
			return 0;
		}
		
	}
	
	public static int getDayInfo(int month) {
		
		switch(month) {
		case 4 :
			return 5;
		case 5 : 
			return 0;
		case 6 : 
			return 3;
		default: 
			return 0;
		}
		
	}
	
	
	
	
	
	
	
}
