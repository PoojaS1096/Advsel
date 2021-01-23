package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class JCBC1 
{
	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AfternoonAdvance","root","arsalan@2020");
		System.out.println("connection established");
		Statement smt=con.createStatement();
		ResultSet res=smt.executeQuery("select * from employee");
		while(res.next())
		{
			String firstname=res.getString("firstname");
			System.out.println("database record is "+firstname);
			
			String email=res.getString("email");
			System.out.println("database record is "+email);
		}
	}

}
