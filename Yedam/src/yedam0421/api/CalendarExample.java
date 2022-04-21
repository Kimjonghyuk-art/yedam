package yedam0421.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
	
		int year = 2020;
		int month = 5;
		
		Calendar today = Calendar.getInstance();
		
		today.set(year, month-1, 1);
		System.out.println("년도 > " + today.get(Calendar.YEAR));
		System.out.println("달 > " + today.get(Calendar.MONTH)+1);
		System.out.println("일 > " + today.get(Calendar.DATE));
		System.out.println("요일 > " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막 날 > " + today.getActualMaximum(Calendar.DATE));
		
		
		
		Date todate = new Date();
		System.out.println(todate.toString());
		//todate = new Date("2021/05/05");
		//todate.setYear(2022-1900);;
		//System.out.println(todate.toString());
		
		//LocalDate ldate = LocalDate.of(2022, 10, 10);
	//	System.out.println(ldate);
		
		//LocalTime ltime = LocalTime.of(10, 10, 10);
		//System.out.println(ltime);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd");
		
		System.out.println(dtf.format(ldt));
		
		
		
		
		
		
		
		
		
		
	}
}
