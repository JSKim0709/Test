package day0901;

public class StringSplit {
	
	private static String[] stringSplit(String str1, String str2) {
		int count=0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)==str2.charAt(0))
				count++;
		}
		
		String[] strs = new String[count+1];
		int fromIndex = 0;
		int index = 0;
		
		for (int i = 0; i < strs.length; i++) {
			index = str1.indexOf(str2, fromIndex);
			if (index==-1)
				strs[i] = str1.substring(fromIndex);
			else
				strs[i] = str1.substring(fromIndex, index);
			fromIndex = index+1;
		}
		
		return strs;
	}

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str,"#");
		System.out.println("=== 문자열 처리 결과 ===");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}

}
