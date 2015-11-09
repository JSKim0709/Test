package day0903;

public class Account {

	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = -creditLineLimit;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws Exception {
		if (creditLine) {
			if (balance-money > creditLineLimit) {
				balance -= money;
			} else {
				throw new Exception("잔고부족 출금불가 합니다.");
			}
		} else {
			if (balance < money) {
				throw new Exception("잔고부족 출금불가 합니다.");
			} else {
				balance -= money;
			}
		}
	}

	@Override
	public String toString() {
		/*
		if (creditLine) {
			return "계좌번호 : " + accountNo + ", 잔고 : " + balance + "원\t[[ " + creditLineLimit
					+ "원 마이너스통장 ]]";
		} else {
			return "계좌번호 : " + accountNo + ", 잔고 : " + balance + "원";
		}
		*/
		return "계좌번호 : " + accountNo + ", 잔고 : " + balance + "원" 
				+ ( creditLine ? "\t[[ " + creditLineLimit + "원 마이너스통장 ]]" : "");
	}
	
	
}
