package yedam0418.Inheritance.ex;

public class ComFriend extends Friend {

	private String company; //회사 이름
	private String department; // 부서
	
	public ComFriend() {
	
	}
	
	public ComFriend(String name, String phoneNum, String company, String department) {
		super(name,phoneNum);
		this.company = company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [name=" + super.getName()+ " phoneNum=" + super.getPhoneNum()+
				" company=" + company + ", department=" + department + "]";
	}

	
	
}
