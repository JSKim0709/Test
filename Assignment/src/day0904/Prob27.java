package day0904;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

class Score {				// ValueObject -> file system°ú DB ºñ±³
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public Score(String name, int kor, int eng, int math, int sum) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}

public class Prob27 {
	
	public Vector getScore(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader(fileName));
		Vector vector = new Vector<>();
		while (scanner.hasNext()) {
			String[] temp = scanner.nextLine().split("/");
			int sum = 0;
			for (int i = 1; i < temp.length; i++)
				sum += Integer.parseInt(temp[i]);
			vector.addElement(new Score(temp[0], Integer.parseInt(temp[1]), 
					Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), sum));
		}
		return vector;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Prob27 p2 = new Prob27();
		Vector scores = p2.getScore("src/data.txt");
		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score)scores.get(i);
			System.out.println(score.getName()+" : "+score.getKor()+" "+score.getEng()
							+" "+score.getMath()+" "+score.getSum());
		}
	}

}
