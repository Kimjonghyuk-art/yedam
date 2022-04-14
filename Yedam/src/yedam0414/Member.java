package yedam0414;

import java.util.Scanner;

public class Member {

	//필드 -> 회원 아이디, 회원 이름, 회원연락처, 회원 나이
	private String memberId;
	private String memberName;
	private String memberContactNum;
	private int memberAge;
	
	public Member() {
	
	}
	
	//생성자
	public Member(String memberId, String memberName, String memberContactNum, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberContactNum = memberContactNum;
		this.memberAge = memberAge;
	}
	//메소드
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberContactNum() {
		return memberContactNum;
	}

	public void setMemberContactNum(String memberContactNum) {
		this.memberContactNum = memberContactNum;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		if( memberAge < 0) {
			memberAge = 10;
		} else {
			this.memberAge = memberAge;
		}
		
	}

	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberContactNum=" + memberContactNum
				+ ", memberAge=" + memberAge + "]";
	}

	public static void main(String[] args) {
		
		Member member = new Member();
		
		/*
		 * member.setMemberAge(20); member.setMemberContactNum("010-8000-1111");
		 * member.setMemberId("kkkkrrreee"); member.setMemberName("김김김");
		 * 
		 * System.out.println(member.toString());
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("몇명>");
		int selectNum = sc.nextInt();
		
		Member members[] = new Member[selectNum];
		for(int i = 0; i < members.length; i ++) {
			members[i] = new Member();
			System.out.println("아이디 이름 연락처 나이 >>.");
			members[i].setMemberId(sc.next());
			members[i].setMemberName(sc.next());
			members[i].setMemberContactNum(sc.next());
			members[i].setMemberAge(sc.nextInt());
		}
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].toString());
		}
		
		
		//1 조회 (이름) 2. 변경 (아이디, 연락처) 3. 조회(나이 큰 회원) 4.종료
		
		while(true) {
		
			System.out.println("##########################################");
			System.out.print("1. 조회(이름) 2.변경(아이디, 연락처) 3. 조회(나이 큰 사용자) 4. 종료");
			int menu = sc.nextInt();
			System.out.println("##########################################");
			
			if(menu == 1) {
				System.out.print("조회할 이름을 입력하세요 >>");
				String searchName = sc.next();
				sc.nextLine();
				for(int i = 0; i < members.length; i++) {
					if(searchName.equals(members[i].getMemberName())) {
						System.out.println(members[i].toString());
					}
				}
								
				
			} else if (menu == 2) {
				System.out.println("변경할 아이디? > ");
				String changeName = sc.next();
				
				for(int i = 0; i < members.length; i++) {
					if(changeName.equals(members[i].getMemberId())) {
						System.out.print("변경할 아이디 입력 > ");
						members[i].setMemberId(sc.next());
						sc.nextLine();
						System.out.print("변경할 연락처 입력> ");
						members[i].setMemberContactNum(sc.next());
						sc.nextLine();
					}
				}
				
				
			} else if (menu == 3) {
				
				System.out.println("조회할 나이 입력 >> ");
				int searchAge = sc.nextInt();
				
				for(int i = 0; i < members.length; i++) {
					if(searchAge < members[i].getMemberAge()) {
						System.out.println(members[i].toString());
					}
				}
				
				
				
			} else if (menu == 4) {
				System.out.println("종료");
				System.exit(0);
			} else {
				for(int i = 0; i < members.length; i++) {
					System.out.println(members[i].toString());
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

	
}
