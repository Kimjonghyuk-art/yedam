package dimension;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.studName = "홍";
		s1.score = 80;
		s1.age = 20;
		Student s2 = new Student();
		
		s2.studName = "김";
		s2.score = 10;
		s2.age = 30;
		System.out.println(s1.studName + " " + s1.score);
		System.out.println(s2.studName + " " + s2.score);

		Student[] stus = {s1, s2};
		Scanner sc = new Scanner(System.in);
		int searchAge = 23;
		
		for(int i = 0; i < stus.length; i++) {
			if(stus[i].age > searchAge) {
				System.out.println(searchAge + "보다 늙은 사람 >> "+ stus[i].studName + 
						"이고나이는 " + stus[i].age + "임");
			}
		}
		
		
		/*
		 * System.out.print("학생 이름 >"); String searchName = sc.nextLine();
		 * 
		 * for(int i = 0; i < stus.length; i++) {
		 * if(stus[i].studName.equals(searchName)) { System.out.println(stus[i].score +
		 * "나이 >" + stus[i].age); } }
		 */
		
		
		
	}

}
