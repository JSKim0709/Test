package day0901;

public class PhoneTest {

	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone("010-010-010", 1000);
		
		cellPhone.call("017-017-017", 10);
		cellPhone.call("016-016-016", 10);
		cellPhone.calculateTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+"의 통화시간은 "+
						cellPhone.getTotalCallTime()+"이며 \n"+
						"단가 "+cellPhone.getFeePerCallTime()+
						" 총 요금은 "+cellPhone.getTotalFee()+"원입니다.");
		
		System.out.println("=====================================");
		
		SmartPhone smartPhone = new SmartPhone("000-000-000", 200);
		smartPhone.call("017-017-017", 10);
		smartPhone.calculateTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+"의 통화시간은 "+
						smartPhone.getTotalCallTime()+"이며 \n"+
						"단가 "+smartPhone.getFeePerCallTime()+
						" 총 요금은 "+smartPhone.getTotalFee()+"원입니다.");
		
		System.out.println("=====================================");
		
		SmartPhone smartPhone01 = new SmartPhone("111-111-111", 0, true, 3000);
		smartPhone01.call("017-017-017", 10);
		smartPhone01.call("016-016-016", 10);
		smartPhone01.calculateTotalFee();
		System.out.println(smartPhone01.getPhoneNumber()+"의 통화시간은 "+
						smartPhone01.getTotalCallTime()+"이며 \n"+
						"단가 "+smartPhone01.getFeePerCallTime()+
						" 총 요금은 "+smartPhone01.getTotalFee()+"원입니다.");
	}

}
