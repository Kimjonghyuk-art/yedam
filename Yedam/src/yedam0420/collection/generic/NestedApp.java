package yedam0420.collection.generic;

import java.util.ArrayList;
import java.util.Scanner;

class Friend {
	private String name;
	private String phone;
	private int age;

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

}

//중첩 클래스, 중첩 인터페이스 만들기
public class NestedApp {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Friend> friendlist = new ArrayList<Friend>();

	// 중첩 인터페이스
	interface FriendService {
		int INSERT = 1;
		int UPDATE = 2;
		int READ = 3;

		void insert();

		void update();

		void read();
	}

	// 중첩 클래스

	static class FriendApp implements FriendService {

		@Override
		public void insert() {
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("연락처 >> ");
			String tel = sc.next();
			System.out.print("나이 >>");
			int age = sc.nextInt();

			Friend insertFriend = new Friend();
			insertFriend.setName(name);
			insertFriend.setPhone(tel);
			insertFriend.setAge(age);

			friendlist.add(insertFriend);

		}

		@Override
		public void update() {
			System.out.print("수정할 이름 입력 >");
			String updateName = sc.next();

			for (int i = 0; i < friendlist.size(); i++) {
				if (friendlist.get(i).getName().equals(updateName)) {
					System.out.print("수정할 번호 > ");
					String updateTel = sc.next();
					System.out.print("수정할 나이 > ");
					int updateAge = sc.nextInt();

					Friend updateFriend = new Friend();
					updateFriend.setName(updateName);
					updateFriend.setPhone(updateTel);
					updateFriend.setAge(updateAge);
					friendlist.set(i, updateFriend);
					break;
				}
			}
		}

		@Override
		public void read() {

			if (!friendlist.isEmpty()) {
				for (Friend i : friendlist) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {

		FriendApp ap = new FriendApp();

		ap.insert();
		ap.insert();
		ap.update();
		ap.read();

	}
}
