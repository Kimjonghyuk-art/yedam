package home.work0415;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		String date = now.format(DateTimeFormatter.ofPattern("MM월 dd일 HH시 MM분"));
		
		System.out.println(date);

		
	}
	

}
