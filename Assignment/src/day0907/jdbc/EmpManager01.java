package day0907.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager01 {
	
	public void printEmployee(String name, int salary) {
		Connection conn = null;
		Statement stmt = null;
		
		String sql = "SELECT employee_id, first_name, salary"
					+ " FROM employees"
					+ " WHERE (first_name LIKE ('%" + name + "%')"
					+ " OR UPPER(first_name) LIKE UPPER('%" + name + "%'))"
					+ " AND salary >= " + salary;
		
		try {
			conn = Connect.getConnection();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt("employee_id");
				String firstName = rs.getString("first_name");
				int eSalary = rs.getInt("salary");
				
				System.out.println(id+"\t"+firstName+"\t"+eSalary);
			}
		} catch (SQLException e) {
			System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
			e.printStackTrace();
		} finally {
			try {
				if (stmt!=null)	stmt.close();
				if (conn!=null)	conn.close();
			} catch (SQLException e2) {
				System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e2.getErrorCode());
				e2.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws SQLException{
		new EmpManager01().printEmployee("al",4000);
	}

}
