package jdbc_programs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRecordbyChar {

	public static void main(String[] args) throws SQLException {
		Connection conn;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character to search");
		String  empName = sc.nextLine();
		String sqlQuery = String.format("SELECT * FROM employees WHERE ename like '%s'",empName+"%");
		System.out.println(sqlQuery);
		conn = PostgresConnetion.getConnection();
		
		//TO move the resultset forward and backward
		//if we not set the option we cannot use rs.first();
		Statement st =  conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			    ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery(sqlQuery);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		
		rs.first();
		if(!rs.next()) {
			System.out.println("No Records found");
		}
		conn.close();

	}

}
