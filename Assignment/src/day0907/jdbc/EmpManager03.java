package day0907.jdbc;

import java.sql.*;

public class EmpManager03 {
	
	public void printEmployee(String city, int lo, int hi) {
		Connect con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = Connect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT e.last_name, d.department_name "
						+ "FROM employees e, departments d, locations l "
						+ "WHERE e.department_id = d.department_id "
						+ "AND d.location_id = l.location_id "
						+ "AND l.city  = '" + city +"' "
						+ "AND e.salary BETWEEN "+lo+" AND "+hi;
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString(1);
				String department = rs.getString(2);
				System.out.println(name+"\t"+department);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EmpManager03().printEmployee("South San Francisco", 7000, 10000);
	}

}
