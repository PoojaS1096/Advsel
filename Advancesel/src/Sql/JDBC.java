package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC
{
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pptgroup","root","Tiger@12345");
		System.out.println("Connection established");
		Statement smt=con.createStatement();
		ResultSet res=smt.executeQuery("select * from Friends");
		
		while(res.next())
		{
			String firstname=res.getString("firstname");
			System.out.println("database recorded is"+firstname);
			
			String email=res.getString("email");
			System.out.println("database recorded is"+email);
		}
		
	}
}
