package jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmnt = null;
		String sql = "DROP TABLE employees";
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","king");
		stmnt = con.createStatement();
		stmnt.executeUpdate(sql);
		System.out.println("Table deleted!");
		con.close();
	}

}
