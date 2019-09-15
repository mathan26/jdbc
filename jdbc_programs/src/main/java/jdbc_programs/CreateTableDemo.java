package jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmnt = null;

		String sql = "CREATE TABLE employees(eno integer NOT NULL,ename varchar(10),salary integer,eaddress varchar(10))";
		//Class.forName("org.postgresql.Driver");    //optional from java 1.6 version onwards
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","king");
		stmnt = con.createStatement();
		stmnt.executeUpdate(sql);
		System.out.println("Table created!");
	}

}
