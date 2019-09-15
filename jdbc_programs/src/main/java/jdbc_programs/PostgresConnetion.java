package jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnetion {
	public static Connection getConnection() throws SQLException {
		
		String dbURL="jdbc:postgresql://localhost:5432";
		String username = "postgres";
		String password = "king";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		return con;
	}
}
