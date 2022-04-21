package yedam0421.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 년도 입력 >");
		int year = sc.nextInt();
		System.out.println("달 입력 > ");
		int month = sc.nextInt();

		showCal(year,month);
		
	
	}
	public static void showCal(int year, int month) {

		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
	
		System.out.println("\t   "+year + "년  " + month + "월 " );
		System.out.println("===============================");
	
		cal.set(year,month-1,1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		
		
	}
	
	
	
	
}