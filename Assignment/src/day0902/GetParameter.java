package day0902;

public class GetParameter {

	private static String getParameter(String url, String paramName) {
		String str = url.substring(url.indexOf("?")+1);
		String[] strArr = str.split("&");
		String parameter = "";

		for (String s : strArr) {
			String[] temp = s.split("=");
			if (temp[0].matches(paramName)) {
				parameter = temp[1];
			}
		}
		
		return parameter;
	}
	
	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("제품 이름 : " + prodName);
		
		String url2
		= "http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";

		String userAddress = getParameter(url2, "address");
		System.out.println("회원 주소 : " + userAddress);
	}

}
