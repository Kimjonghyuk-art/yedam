package yedam0421.api;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// 주민번호, 생년월일 -> 남/여 구분
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("주민번호 입력 > ");
			String jumin = sc.next();
			String result = checkInfo(jumin);
			
			System.out.println(result);
		}
	
	}
	//950405 - 2345678 => 95년 4월 5일 생, 여자입니다.
			// 991001-1234567 => 99년 10월 1일생 , 남자입니다.
			//9704051234567 -> 97년 4월 5일생 , 남자입니다 .
			//0505053456789 -> 5년 생 5월 5일 생, 남자

	public static String checkInfo(String jumin) {
		String year = jumin.substring(0,2);
		String month = jumin.substring(2,4);
		month = month.replace("0", " ");
		String day = jumin.substring(4,6);
		day = day.replace("0", " ");
		String last = jumin.substring(jumin.length()-7, jumin.length()-6);
		String sex;
		
		if(last.equals("1") || last.equals("3")) {
			sex = "남";
		}else if(last.equals("2") || last.equals("4")) {
			sex = "여";
		} else {
			sex ="몰라";
		}
		
		return year+"년 생" + month +"월" + day + "일 생 "  + sex + "입니다." ;
	}
	
}
