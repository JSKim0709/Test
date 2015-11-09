package day0907.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Scanner;

public class Connect {
	
	public static Connection getConnection() {
		String url = null;
		String driver = null;
		String id = null;
		String pwd = null;
		Connection con = null;
		
		try {
			Scanner scn = new Scanner(new FileReader("connectInfo.txt"));
			while (scn.hasNextLine()) {
				String temp = scn.nextLine();
				if (temp.startsWith("url")) {
					url = temp.split("=")[1];
				} else if (temp.startsWith("driver")) {
					driver = temp.split("=")[1];
				} else if (temp.startsWith("id")) {
					id = temp.split("=")[1];
				} else if (temp.startsWith("pwd")) {
					pwd = temp.split("=")[1];
				}
			}
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pwd);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return con;
	}
	
}
