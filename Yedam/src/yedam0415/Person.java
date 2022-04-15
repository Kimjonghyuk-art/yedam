package yedam0415;

public class Person {
	//상수 필드 
	static final double PI = 3.14; //클래스소속, 변경불가, 
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [nation=" + nation + ", ssn=" + ssn + ", name=" + name + "]";
	}
	
	
	
}
