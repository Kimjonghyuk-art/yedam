package home.work0415;

public class PhoneBookApp {

	private PhoneBook[] phonebook;

	public PhoneBookApp() {
		
	}
	
	//배열의 크기
	public void size(int size) {
		phonebook = new PhoneBook[size];
		
	}
	//등록 메소드 
	public void input(PhoneBook phonebooks) {
		
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] == null) {
				phonebook[i] = phonebooks;
				System.out.println("등록이 완료되었습니다.");
				break;
			}
		}
	}

	//전체 조회 메소드
	public void view() {
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null) {
				phonebook[i].info();
			} 
		}
		
	}
	//수정 메소드
	public void update(PhoneBook phonebooks,String searchName) {
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i].getName().equals(searchName) &&
					phonebook[i] != null) {
				phonebook[i].setBirthDay(phonebooks.getBirthDay());
				phonebook[i].setName(phonebooks.getName());
				phonebook[i].setPhoneNumber(phonebooks.getPhoneNumber());
				break;
			}
			
		}
	}
	//이름이 같은지 체크하는 메소드
	public boolean checkName(String searchName) {
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i].getName().equals(searchName)) {
				return true;
			}
		}
		return false;
		
	}
	//삭제 메소드 
	public void delete(String deleteName) {
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i].getName().equals(deleteName) &&
					phonebook[i] != null) {
				phonebook[i].setName(null);
				phonebook[i].setBirthDay(null);
				phonebook[i].setPhoneNumber(null);
				System.out.println("삭제되었습니다.");
				break;
			}
		}
		
	}



}
