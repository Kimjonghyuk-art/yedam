package home.work0415;

import java.util.ArrayList;
import java.util.Scanner;

//이름을 4개 입력 받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름 출력 
public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var b = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++) {
			System.out.print("이름 입력 >>");
			String s = sc.next();
			b.add(s);
		}
		
		for(int i = 0; i < b.size(); i++) {
			String name = b.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		for(int i = 1; i < b.size(); i++) {
			if(b.get(longestIndex).length() < b.get(i).length()) {
				longestIndex = i;
			}
		}
		
		System.out.println("\n 가장 긴 이름은 : " + b.get(longestIndex));
		sc.close();
	}
}
