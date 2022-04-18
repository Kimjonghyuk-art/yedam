package yedam0418.Inheritance.ex;

public class UnivFriend extends Friend {

	private String univ;//학교 이름
	private String major; //전공
	
	public UnivFriend() {
	
	}

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name,phone);
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [name= " + super.getName()+" phoneNum="+ this.getPhoneNum() + 
				" univ=" + univ + ", major=" + major + "]";
	}

	
	
}
