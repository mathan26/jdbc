package jdbc_programs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSingleRow{

	public static void main(String[] args) throws SQLException {
		Connection con = PostgresConnetion.getConnection();
		String sqlQuery="delete from employees where ename='sakthi'";
		Statement st = con.createStatement();
		int updateCount=st.executeUpdate(sqlQuery);
		System.out.println("The number of rows deleted :"+updateCount);
		con.close();

	}

}
