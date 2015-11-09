package day0903;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FileController {
	
	public void reverseLine(String oldf, String newf) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(oldf));
		///BufferedWriter bw = new BufferedWriter(new FileWriter(newf));
		PrintWriter bw = new PrintWriter(new FileWriter(newf));
		//List<String> temp = new ArrayList<>();
		Stack<String> stack = new Stack<String>();
		String source = "";
		
		while ((source=br.readLine()) != null) {
			//temp.add(0,source);
			stack.push(source);
		}
	/*	
		for (String str : temp) {
			bw.write(str);
			bw.newLine();
		}
	*/
		while (stack.size()!=0) {
			///bw.write(stack.pop());
			///bw.newLine();
			bw.println(stack.pop());
		}
		bw.flush();
		
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf,newf);
	}

}
