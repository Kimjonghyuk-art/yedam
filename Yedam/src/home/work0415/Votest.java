package home.work0415;

public class Votest {

	private String name;
	private int num;
	
	
	
	public Votest(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name2) {
		
		this.name = name2;
		
	}
	
	public void info() {	
		System.out.println(name +" "+ num);
		
	}
	
}
