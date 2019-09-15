package jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSingleRowDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmnt = null;
		String sql = "INSERT INTO employees values (748, 'sakthi', 25000,'Tup')";
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","king");
		stmnt = con.createStatement();
		int updatecount = stmnt.executeUpdate(sql);
		System.out.println("No of rows affected "+updatecount);
		//POSTGRES AUTOCOMMIT ON/OFF CHECK: \echo :AUTOCOMMIT
		//sometimes default setting of the AUTOCOMMIT is OFF 
		//to store data permanently need to commit the changes to database.
		
		//BY Default JAVA JDBC AUTOCOMMIT is TRUE
		con.setAutoCommit(false);
		con.commit(); 
		con.close();
					  
	}

}
