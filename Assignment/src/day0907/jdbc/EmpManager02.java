package day0907.jdbc;

import java.sql.*;

public class EmpManager02 {
	
	public void printEmployee(String[] jobs) throws SQLException {
		Connect con = Connect.getConnection();
		String sql = "SELECT e.employee_id, e.first_name, e.salary "
					+ "FROM employees e, jobs j "
					+ "WHERE e.job_id = j.job_id "
					+ "AND j.job_title IN (?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, jobs[0]);
		pstmt.setString(2, jobs[1]);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int empId = rs.getInt(1);
			String firstName = rs.getString(2);
			int empSalary = rs.getInt(3);
			System.out.println(empId+"\t"+firstName+"\t"+empSalary);
		}
		
		rs.close();
		pstmt.close();
		con.close();
	}

	public static void main(String[] args) throws SQLException {
		String[] jobs = {"Accountant", "Stock Clerk"};
		new EmpManager02().printEmployee(jobs);
	}

}
