package jdbc_programs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRecords {

	public static void main(String[] args) throws SQLException {
		Connection con = PostgresConnetion.getConnection();
		Statement stmnt = con.createStatement();
		String sqlQuery="SELECT  * FROM  employees where salary >2000";
		ResultSet rs =stmnt.executeQuery(sqlQuery);
		boolean flag=false;
		System.out.println("ENO\tENAME\tSALARY\tADDR");
		System.out.println("---------------------------");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		if(flag==false)
		{
			System.out.println("No Matched Records Found");
		}
		
		con.close();

	}

}
