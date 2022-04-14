package yedam0414;

import java.util.Scanner;

public class TvExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int selectChanel;
		
		Television tv = new Television();
		
		tv.turnOn();
		tv.turnOff();
		System.out.print("채널>");
		selectChanel = sc.nextInt();
		tv.changeChanel(selectChanel);
		tv.color = "노랑";
		tv.company = "삼성";
		tv.model = "자동차";
		tv.price = 1000000;

		System.out.println(tv.color + " " + tv.company +" "+ tv.model+" " + tv.price);
		
		
	}

}
