package yedam0418.Inheritance;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 시동 켜기 2. 출발하기 3. 운행하기 4. 멈추기 5.시동끄기 
		
		Car car = null;
		//Sonata car = new Sonata();
		car = new Sonata();
		car = new Avante();
		while(true) {
			System.out.println("1.시동켜기 2.출발하기 3.운행하기 4.멈추기 5.시동끄기");
			System.out.print("선택 >>");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				car.turnOn();
			} else if(menu == 2) {
				car.start();
			} else if(menu == 3) {
				car.run();
			} else if(menu == 4) {
				car.stop();
			} else if(menu == 5) {
				car.turnOff();
			} else {
				break;
			}
			
			
		}
		
		System.out.println("end of prog.");
		
		
	}
}
