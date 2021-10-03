package com.ecommerce.dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopFashion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","csdl");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;	
	}
  
}
