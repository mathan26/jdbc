package jdbc_programs;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInputUtil {

	public static void main(String[] args) {
		
		String sql;
		Scanner input = new Scanner(System.in);
		int eno;
		String ename;
		double salary;
		String address;
		
		System.out.println("Enter the employee Number");
		eno = input.nextInt();
		System.out.println("Enter the employee Name");
		ename = input.next();
		System.out.println("Enter the employee Salary");
		salary = input.nextDouble();
		System.out.println("Enter the employee Address");
		address = input.next();
		
		System.out.println("Provided inforation");
		System.out.println("-------------------");
		
		System.out.println(eno+"\t"+ename+"\t"+salary+"\t"+address);
		
		
		sql = "INSERT INTO employees values ("+eno+",'"+ename+"',"+salary+",'"+address+"')";
		
		System.out.println("DYNAMIC INSERT QUERY");
		
		System.out.println(sql);
		input.close();
		
		System.out.println("Using String.format() method");
		sql = String.format("INSERT INTO employees(%d, '%s', %f, '%s')", eno,ename,salary,address);
		System.out.println(sql);
	}

}
