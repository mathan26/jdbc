package jdbc_programs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSingleRow {

	public static void main(String[] args) throws SQLException {
		Connection con=PostgresConnetion.getConnection();
		Statement stmnt = con.createStatement();
		String sql = "UPDATE employees SET salary=10000 WHERE ename='Mathan'";
		int updatedRows = stmnt.executeUpdate(sql);
		System.out.println(updatedRows+" Rows updated");
		con.close();
	}

}
