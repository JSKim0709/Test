package day0902;

public class CellPhone {
	
	private String model;
	private double battery;

	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	public CellPhone(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	
	public void call(int time) {
		if (time<0) {
			throw new IllegalArgumentException("통화시간입력오류");
		} else {
			System.out.println("통화 시간 : " + time + " 분");
			battery -= time * 0.5;
			if (battery<0) {
				battery = 0;
			}
		}
	}
	
	public void charge(int time) {
		if (time<0) {
			throw new IllegalArgumentException("충전시간입력오류");
		} else {
			System.out.println("충전 시간 : " + time + " 분");
			battery += time * 3;
			if (battery>100) {
				battery = 100.0;
			}
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : " + battery);
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject instanceof CellPhone) {
			if (this.model==((CellPhone)otherObject).getModel()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
