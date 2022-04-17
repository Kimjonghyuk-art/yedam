package home.work0415;

import java.util.ArrayList;
import java.util.Scanner;

//이름을 4개 입력 받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름 출력 
public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> b = new ArrayList<String>();
		
		String s;
		/*
		 * for(int i = 0; i < 4; i++) { System.out.print("이름 입력 >>"); s = sc.next();
		 * if(b.contains(s)) { System.out.println("중복된 값"); continue; } b.add(s); }
		 */
		
		
		
		/*
		 * for(int i = 0; i < b.size(); i++) { String name = b.get(i);
		 * System.out.print(name + " "); }
		 */
		
		for(String i : b) {
			System.out.print(i + " ");
		}
		
		
		int longestIndex = 0;
		for(int i = 1; i < b.size(); i++) {
			if(b.get(longestIndex).length() < b.get(i).length()) {
				longestIndex = i;
			}
		}
		
		//System.out.println("\n 가장 긴 이름은 : " + b.get(longestIndex));
		
		ArrayList<Votest> votest = new ArrayList<Votest>();
		
		
		votest.add(new Votest("1이름",1));
		votest.add(new Votest("2이름",2));
		
		
		for(int i = 0; i < votest.size(); i++) {
			System.out.println(votest.get(i).getName());
		}
		
		for(int i = 0; i < votest.size(); i++) {
			System.out.print("검색이름> ");
			String searchname = sc.next();
			if(votest.get(i).getName().equals(searchname)) {
				System.out.print("수정할 이름 >");
				String updatename = sc.next();
				votest.get(i).setName(updatename);
				System.out.println("수정된 이름" + votest.get(i).getName());
			} else {
				System.out.println("다른이름");
			}
		}
		
		sc.close();
	}
}
