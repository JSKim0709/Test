package day0907.jdbc;

import java.sql.*;

public class EmpStatistics {
	
	public void printStatistics(int maxSalary) {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connect con = null;
		Statement stmt = null;
		
		try {
			con = Connect.getConnection();
			stmt = con.createStatement();
			
			System.out.println("======================================");
			System.out.println("Max Salary : " + maxSalary);
			System.out.println("======================================");
			
			String sql = "SELECT j.job_title, AVG(e.salary) "
					+ "FROM employees e, jobs j "
					+ "WHERE e.job_id = j.job_id AND e.salary >= " + maxSalary
					+ "GROUP BY j.job_title "
					+ "ORDER BY 2 DESC";

			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println("["+rs.getString("job_title")+"] "+rs.getInt("AVG(e.salary)"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)	stmt.close();
				if (con != null)	con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		EmpStatistics es = new EmpStatistics();
		es.printStatistics(10000);
		es.printStatistics(15000);
	}

}
