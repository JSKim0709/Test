package day0901;

public class SmartPhone extends CellPhone {
	
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}

	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}

	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}

	@Override
	public void calculateTotalFee() {
		if (isMonthlyFixedRate) {
			System.out.println("고객님은 "+monthlyFixedFee+" 정액 요금제입니다.");
			setTotalFee(monthlyFixedFee);
		} else {
			super.calculateTotalFee();
		}
	}

}
