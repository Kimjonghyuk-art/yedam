package dimension;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		

		
		Student[] stuarr = {new Student(),new Student(),new Student()};
		stuarr[0].studName = sc.next();
		stuarr[0].score = Integer.parseInt(sc.next());
		stuarr[0].age = Integer.parseInt(sc.next());

		
		
		//조회하고 싶은 이름 입력 
		
		//해당 이름 홍길동은 20살 점수 > 
		String searchName;
		while(true) {
			
			for(int i = 0; i < stuarr.length; i++) {	
				System.out.print("학생이름 점수 나이 >>");
				stu.studName = sc.next();// 스페이스를 기준으로 하나씩 구분해서 가지고옴
				stu.score = Integer.parseInt(sc.next());
				stu.age = Integer.parseInt(sc.next());
				
			}
			
			
			
			System.out.print("조회 하고 싶은 이름 입력 >> ");
				searchName = sc.nextLine();
				
			for(int i = 0; i < stuarr.length; i ++) {
				if(stuarr[i].studName.equals(searchName)) {
					System.out.println("죄회하신 이름은 > " + stuarr[i].studName + 
					"점수는 >>" + stuarr[i].score + "입니다.");
				}
			}	
		}
		
		
		
		
		
		
		
		
		

	}

}
