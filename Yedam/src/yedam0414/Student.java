package yedam0414;

public class Student {

	private String name;
	private String studNo;
	private int age;
	private double height;
	
	public Student() {
	}
	
	public Student(String name, String studNo, int age, double height) {
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudNo() {
		return studNo;
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void study() {
		System.out.println(name+"가 공부를 합니다.");
	}
	
	void eat() {
		System.out.println(name+ "가 식사를 합니다.");
	}
	
	void showInfo() {
		System.out.println("이름은" + getName() + "이고 학생번호는 " + getStudNo() + "이고 나이는 " + 
	getAge() + " 키는 " + getHeight() + "입니다" );
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student("박준준","23번",24,175.3);
		stu.showInfo();
		stu.study();
		stu.eat();
		stu.setAge(20);
		System.out.println(stu.getAge());
		
		Student stu1 = new Student();
		
		/*
		 * stu1.name = "김이박"; stu1.age = 20; stu1.height = 189.3; stu1.studNo = "59번";
		 * stu1.showInfo(); stu1.study(); stu1.eat();
		 */
		
		stu1.setAge(20);
		stu1.setHeight(157.6);
		stu1.setName("김");
		stu1.setStudNo("99번");
		stu1.showInfo();
		stu1.eat();
		
		
	}

}
