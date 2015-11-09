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
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			}
		} else {
			if (balance < money) {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			} else {
				balance -= money;
			}
		}
	}

	@Override
	public String toString() {
		/*
		if (creditLine) {
			return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��\t[[ " + creditLineLimit
					+ "�� ���̳ʽ����� ]]";
		} else {
			return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��";
		}
		*/
		return "���¹�ȣ : " + accountNo + ", �ܰ� : " + balance + "��" 
				+ ( creditLine ? "\t[[ " + creditLineLimit + "�� ���̳ʽ����� ]]" : "");
	}
	
	
}
