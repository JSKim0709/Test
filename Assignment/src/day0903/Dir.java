package day0903;

import java.io.File;

public class Dir {
	
	private void printDir(String str) {
		File[] directory = new File(str).listFiles();
		for (File file : directory) {
			if (file.isDirectory()) {
				printDir(file.getPath());
			} 
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		new Dir().printDir("test_dir");
		System.out.println("출력이 완료되었습니다.");
	}

}
