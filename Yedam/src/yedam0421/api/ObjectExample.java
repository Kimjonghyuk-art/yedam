package yedam0421.api;

import java.util.HashSet;
import java.util.Iterator;

class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
	//	return super.hashCode();
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			return this.name.equals(m.name);
		}
		
		
	//	return super.equals(obj);
		return false;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

public class ObjectExample {
	public static void main(String[] args) {
		
		//ArrayList : 인덱스 요소를 구분. -> 중복된 저장 가능
		//Set (집합) : 요소값으로 구분 -> 등록된 값X
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(100);
		hashset.add(200);
		hashset.add(300);
		hashset.add(200);//중복된 값은 저장되지 않음 
		//System.out.println(hashset.size());
		
		HashSet<Member> members = new HashSet<Member>();
		
		members.add(new Member("이름",20));
		members.add(new Member("이름1",20));
		members.add(new Member("이름22",10));
		System.out.println(members.size());
		System.out.println("이름".hashCode());
		
		Iterator<Member> iterator = members.iterator();

		
		while(iterator.hasNext()) {
			Member m = iterator.next();
			
			System.out.println(m.toString());
		}

	
	
	}
}
