package jdbc_programs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRows {

	public static void main(String[] args) throws SQLException {
		Connection con = PostgresConnetion.getConnection();
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter increment Amount:");
		double increment =sc.nextDouble();
		System.out.println("Enter Salary Range:");
		double salRange =sc.nextDouble();
		String sqlQuery=String.format("UPDATE employees SET salary = salary + %f WHERE salary <= %f",increment,salRange);
		int updateCount=st.executeUpdate(sqlQuery);
		System.out.println("The number of rows updated :"+updateCount);
		con.close();

	}

}
