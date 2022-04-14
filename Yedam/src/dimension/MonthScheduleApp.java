package dimension;

import java.util.Scanner;

class Day {
	private String work; //하루의 할일을 나타내는 문자열
	
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		} else {
			System.out.println(work+ "입니다.");
		}
	}
}

class MonthSchedule {

	Scanner sc = new Scanner(System.in);
	private int days;
	Day day[];
	public MonthSchedule(int days) {
		this.days = days;
		day = new Day[days];
		for(int i = 0; i < day.length; i++) {
			day[i] = new Day();
		}
	}
	
	void run () {
		int selectNum;
		while(true) {			
			System.out.print("할일(입력:1 보기:2, 끝내기3) >>");
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 1 :
				input();
				break;
			case 2 :
				view();
				break;
				
			case 3 : 
				finish();
			default :
				System.out.print("다시 입력하세요"); 
			}
		}
	}
	
	void input() {
			System.out.print("날짜?");
			int selectDay = sc.nextInt();
			sc.nextLine();
			System.out.print("할일>>");
			String work = sc.nextLine();
			day[selectDay-1].set(work);
			System.out.println();
	}
	void view() {
		System.out.print("날짜?");
		int selectDay = sc.nextInt();
		System.out.println(selectDay+"일의 할 일은");
		day[selectDay-1].show();
	}
	void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}

public class MonthScheduleApp {

	public static void main(String[] args) {
		MonthSchedule ms = new MonthSchedule(30);
		ms.run();
		
	}

}
