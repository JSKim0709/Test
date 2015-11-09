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
		System.out.println("�Է� : Korea");
		System.out.println("��� : " + p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : " + p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : " + p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : " + p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : " + p1.toEncoding("0319"));
	}

}
