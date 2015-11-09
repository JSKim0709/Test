package day0902;

public class Prob23 {

	public String toEncoding(String str) {
		String encodedStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			byte[] temp = String.valueOf(c).getBytes();
			if (temp.length==1) {
				encodedStr += c;
			} else {
				for (byte b : temp) {
					encodedStr += "%" + Integer.toHexString(b).substring(6).toUpperCase();
				}
			}
		}
		
		return encodedStr;
	}
	
	public static void main(String[] args) {		
		Prob23 p1 = new Prob23();
		System.out.println("입력 : Korea");
		System.out.println("출력 : " + p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : " + p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : " + p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : " + p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : " + p1.toEncoding("0319"));
	}

}
