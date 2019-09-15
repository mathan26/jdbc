package jdbc_programs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultipleRow {

	public static void main(String[] args) throws SQLException {
		Connection con = PostgresConnetion.getConnection();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter CutOff Salary to remove employee");
		double cutoffSalary = input.nextDouble();
		
		String sqlQuery=String.format("DELETE FROM employees WHERE salary >= %f", cutoffSalary) ;
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate(sqlQuery);
		System.out.println("The number of rows deleted :"+updateCount);
		con.close();
	}

}
