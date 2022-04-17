package home.work0415;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManagement {
	
	//등록
	public void insert(HashMap<String, Phone> map) {
	Phone p;
	String name, address, telephone;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름 >> ");
	name = sc.next();
	System.out.print("주소 >> ");
	address = sc.next();
	System.out.print("전화 번호 >> ");
	telephone = sc.next();
	
	p = new Phone(name, address, telephone);
	map.put(p.getName(), p);
	
	}
	
	//삭제
	public void delete(HashMap<String, Phone> map) {
		String deletename;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		deletename = sc.next();
		
		if(map.containsKey(deletename)) {
			map.remove(deletename);
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println(deletename + "는 등록되지 않은 사람입니다.");
		}
		
	}
	
	//찾기
	
	public void search(HashMap<String, Phone> map) {
		String searchname;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름>>");
		searchname = sc.next();
		
		if(map.containsKey(searchname)) {
			System.out.println(searchname + " " + map.get(searchname).getAddress()+ " "
					+ map.get(searchname).getTelephone());
		} else {
			System.out.println(searchname + "는 등록되지 않은 사람입니다.");
		}
		
	}
	
	//전체보기
	
	public void printall(HashMap<String, Phone> map) {
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			Phone p = map.get(name);
			System.out.println(name + " " + p.getAddress() + " "
					+ p.getTelephone());
		}
		
	}
	
}
