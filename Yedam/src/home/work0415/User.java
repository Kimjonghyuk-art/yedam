package home.work0415;

public class User {

	private String id;
	private String password;
	private String address;
	private String date;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String id, String password, String address, String date) {
		super();
		this.id = id;
		this.password = password;
		this.address = address;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void userInfo() {
		System.out.println("유저 아이디 > " + id + " 지역 : " + address +
				" 가입 날짜 " + date);
	}
	
	
}
