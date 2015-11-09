package day0904;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Grade {
	
	public void printGrade(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader(fileName));
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		while (scanner.hasNextLine()) {
			String[] temp = scanner.nextLine().split(",");
			System.out.println(temp[0]+"의 점수는 "+temp[1]+"점 입니다.");
			sum += Integer.parseInt(temp[1]);
			count++;
		}
		
		System.out.println("모두의 총점은 "+sum+"점 입니다.");
		avg = sum / count;
		System.out.println("모두의 평균은 "+avg+"점 입니다.");
	}

	public static void main(String[] args) {
		Grade grade = new Grade();
		String fileName = "score.txt";
		try {
			grade.printGrade(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
