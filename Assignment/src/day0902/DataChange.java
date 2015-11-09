package day0902;

import java.util.List;
import java.util.Vector;

public class DataChange {
/*
	public Vector<String> dataChange(String[] strData) {
		Vector<String> vector = new Vector<String>(strData.length);
		StringBuffer sb = new StringBuffer();
		for (String str : str Data) {
			sb.append(str).reverse();
			vector.add(0, sb.toString());
			sb.delete(0, sb.capacity());
		}
		
		return vector;
	}
*/
	public List<String> dataChange(String[] strData) {
		List<String> vector = new Vector<String>(strData.length);
		StringBuffer sb = new StringBuffer();
		for (String str : strData) {
			sb.append(str).reverse();
			vector.add(0, sb.toString());
			sb.delete(0, sb.capacity());
		}
		
		return vector;
	}
	
	public static void main(String[] args) {
		DataChange st = new DataChange();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		//Vector<String> v = st.dataChange(strData);
		List<String> v = st.dataChange(strData);
		
		//for (int i = 0; i < v.size(); i++) {
		//	System.out.println(v.elementAt(i));
		//}
		
		//Enhanced For Loop
		for (String str : v) {
			System.out.println(str);
		}
	}

}
