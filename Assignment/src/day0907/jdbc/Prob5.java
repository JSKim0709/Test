package day0907.jdbc;

import java.sql.*;

public class Prob5 {

	public static void main(String[] args) {
		if (args.length!=1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(0);
		}
		String dept_id = args[0];
		
		Connect con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			con = Connect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT e.employee_id, d.department_name, e.salary, vt.avg AVG_SALARY "
					+ "FROM employees e, departments d, (SELECT AVG(salary) avg, department_id "
					+ "FROM employees GROUP BY department_id) vt "
					+ "WHERE e.department_id = d.department_id "
					+ "AND e.department_id = vt.department_id "
					+ "AND e.department_id = " + dept_id;
			rs = stmt.executeQuery(sql);
			rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			for (int i=1; i<=count; i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			
			while (rs.next()) {
				int empId = rs.getInt(1);
				String deptName = rs.getString(2);
				int empSal = rs.getInt(3);
				int avgSal = rs.getInt(4);
				System.out.println(empId+"\t\t"+deptName+"\t"+empSal+"\t"+avgSal);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
