package co.edu.app;

import java.util.Scanner;

public class AccountApp {

	Scanner sc = new Scanner(System.in);
	
	Account[] accounts = new Account[10]; //계좌 정보를 저장하기 위한 배열 선언
	
	public void execute() {
		
		while(true) {
			System.out.println("----------------------------------------");
			System.out.print("1.계좌생성 2.목록 3.입금 4.출금 5.종료>>");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				createAccount();
				break;
				
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("다시 입력하세요");
			}
			
		}
	}
	
	//계좌생성 메소드 
	public void createAccount() {
		System.out.print("계좌번호 >");
		String accountNum = sc.next();
		System.out.print("예금주 > ");
		String accountHolder = sc.next();
		System.out.print("초기 입금액 > ");
		int accountBalance = sc.nextInt();
		Account account = new Account(accountNum, accountHolder, accountBalance);
		//입력 받은 값을 배열에 넣어줌
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				System.out.println("게좌 정보가 저장되었습니다.");
				break;
			} else if(accounts[i].getAccountNum().equals(accountNum) &&
					accounts[i] != null) {
				System.out.print("값이 존재함");
				break;
			}
		}
	}
	
	//입금 실행 메소드 
	public void deposit() {
		System.out.print("입금할 계좌 입력 >>");
		String depositAccount = sc.next();
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getAccountNum().equals(depositAccount) &&
					accounts[i] != null) {
				System.out.print("입금금액 입력 >");
				int depositMoney = sc.nextInt();
				int currentMoney = accounts[i].getAccountBalance();
				int sum = depositMoney+currentMoney;
				accounts[i].setAccountBalance(sum);
				System.out.println("입금 완료");
				break;
			}
		}
	}
	//출금 메소드
	public void withdraw() {
		System.out.print("출금할 계좌 입력 >>");
		String depositAccount = sc.next();
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getAccountNum().equals(depositAccount) &&
					accounts[i] != null) {
				System.out.print("출금금액 입력 >");
				int subMoney = sc.nextInt();
				int currentMoney = accounts[i].getAccountBalance();
				if(currentMoney > subMoney) {
					int sub = currentMoney - subMoney;
					accounts[i].setAccountBalance(sub);
					System.out.println("출금 완료 ");
				} else {
					System.out.println("현재 금액보다 출금하려는 금액이 큼");
				}
				break;
			}
		}
		
	}
	
	//목록 실행 메소드 
	public void accountList() {
		
		for(int i = 0; i <accounts.length; i++) {
			if(accounts[i] != null) {
				accounts[i].info();
				
			}
				
		}
	}

}
