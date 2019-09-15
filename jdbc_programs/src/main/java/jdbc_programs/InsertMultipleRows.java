package jdbc_programs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMultipleRows {

	public static void main(String[] args) throws SQLException {
		Connection con=PostgresConnetion.getConnection();
		Statement statmenet;
		System.out.println("connected");
		Scanner input = new Scanner(System.in);
		int eno;
		String ename;
		double salary;
		String address;

		while(true) {
			System.out.println("Enter the employee Number");
			eno = input.nextInt();
			System.out.println("Enter the employee Name");
			ename = input.next();
			System.out.println("Enter the employee Salary");
			salary = input.nextDouble();
			System.out.println("Enter the employee Address");
			address = input.next();

			System.out.println("Provided inforation");
			System.out.println(eno+"\t"+ename+"\t"+salary+"\t"+address);
			String sql = String.format("INSERT INTO employees values (%d, '%s', %f, '%s')", eno,ename,salary,address);
			System.out.println("[SQL]"+sql);
			statmenet = con.createStatement();
			statmenet.executeUpdate(sql);
			System.out.println("Data inseted successfully.\n");
			System.out.println("Do you want to continue? (y/n)");
			if(input.next().equalsIgnoreCase("n")) {
				break;
			}
		}
		con.close();
		input.close();

	}

}
