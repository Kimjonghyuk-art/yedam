package co.edu.app;

public class Account {

	//필드 : 계좌번호, 예금주 , 잔액  
	
	final String accountNum;  //계좌 번호
	private String accountHolder; // 예금 주
	private int accountBalance = 0; // 잔액 = 기본값 0
	
	//생성자 
	public Account(String accountNum, String accountHolder, int accountBalance) {
		super();
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}


	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountNum() {
		return accountNum;
	}
	
	
	public void info() {
		System.out.println("계좌 번호 > " + accountNum);
		System.out.println("예금 주 > " + accountHolder);
		System.out.println("잔액 >" + accountBalance);
	}
	
	
}
