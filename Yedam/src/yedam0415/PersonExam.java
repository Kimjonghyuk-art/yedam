package yedam0415;

public class PersonExam {
	public static void main(String[] args) {
		
		Person p1 = new Person("2024211-242421", "김나박이");
		p1.name = "nababo";
		
		//오류 -> final로 선언 되어있음
		//p1.ssn = "111-111";
		System.out.println(p1.toString());
		
		Person p2 = new Person("1234-5678", "김김박박");
		//final로 선언 되었지만 다른 객채를 생성해서 다른 값을 지정할 수 있음 
		System.out.println(p2.toString());
		
	}
}
