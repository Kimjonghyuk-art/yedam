package home.work0415;

public class PhoneBook {

	private String name; //이름
	private String phoneNumber; // 전화번호
	private String birthDay; // 생일
	public PhoneBook() {
	
	}

	public PhoneBook(String name, String phoneNumber, String birthDay) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void info() {
		System.out.println("이름> " + name);
		System.out.println("번호> " + phoneNumber);
		System.out.println("생일> " + birthDay);
		
	}

}

