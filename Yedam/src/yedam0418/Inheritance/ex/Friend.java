package yedam0418.Inheritance.ex;
//친구의 주소록 : 이름, 연락처
//학교 친구 : 학교 이름, 전공 
//회사 친구 : 회사이름, 부서
public class Friend {

	private String name;
	private String phoneNum;
	private Gender gender;
	
	protected Friend() {
	}

	public Friend(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}
	

	public Friend(String name, String phoneNum, Gender gender) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phoneNum=" + phoneNum + ", gender=" + gender + "]";
	}

	
	
	
}
