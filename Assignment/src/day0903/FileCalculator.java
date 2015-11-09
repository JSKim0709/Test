package day0903;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCalculator {
	
	public void addCalculateResult(String inputFileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true));
		
		String source = "";
		int sum = 0;
		int multiply = 1;
		
		while ((source=br.readLine())!=null) {
			sum += Integer.parseInt(source);
			multiply *= Integer.parseInt(source);
		}
		bw.newLine();
		bw.write(String.valueOf(sum));
		bw.newLine();
		bw.write(String.valueOf(multiply));
		
		bw.flush();
		
		br.close();
		bw.close();
	}

	public static void main(String[] args) {
		FileCalculator fc = new FileCalculator();
		try {
			fc.addCalculateResult("C:\\workspace\\PJT\\test.dat");
		} catch (FileNotFoundException e1) {
			System.out.println("파일을 찾을 수 없습니다.");
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
