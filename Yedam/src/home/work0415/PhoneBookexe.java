package home.work0415;

import java.util.Scanner;

public class PhoneBookexe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneBookApp pba = new PhoneBookApp();
		pba.size(10);
		int index = 1;
		while(true) {
			System.out.println("1.등록 2.수정 3.삭제 4.조회 5.작성자조회 6.종료");
			System.out.print("선택>>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				System.out.print("이름 입력 >>");
				String name = sc.nextLine();
				System.out.print("번호 입력 >>");
				String phoneNumber = sc.nextLine();
				System.out.print("생일 입력 >>");
				String birthday = sc.nextLine();
				PhoneBook phonebook = new PhoneBook(name,phoneNumber,birthday);
				pba.input(phonebook);
				
				break;
			case 2 :
				System.out.print("수정할 이름 검색 >");
				String searchName = sc.nextLine();
				if(pba.checkName(searchName) == true){
					System.out.print("수정할 이름 입력 >");
					String updateName = sc.nextLine();
					System.out.print("번호 수정 > ");
					String updatePhoneNumber = sc.nextLine();
					System.out.print("생일 수정 > ");
					String updateBirthDay = sc.nextLine();
					PhoneBook pb = new PhoneBook(updateName,updatePhoneNumber,updateBirthDay);
					pba.update(pb);
				} else {
					System.out.println("검색한 이름이 존재하지 않음.");
				}
				
				break;
			case 3 :
				break;
			case 4 :
				pba.view();
				break;
			case 5 :
				break;
			case 6 :
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("다시 입력하세요");
			
			}
			
			
			
		}
		
		
		

	}

}
