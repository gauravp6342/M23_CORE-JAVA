package com.capgemini.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//data access object
public class EmployeeDao 
{
	//making a connection between java & mysql
	public Connection createConnection()
	{
		String URL="jdbc:mysql://localhost:3306/TNS";
		String user="root";
		String password="6342@gaurav@2672@mysqlpassword";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection c;
		try
		{
			c=DriverManager.getConnection(URL, user, password);
		}
		catch(SQLException e)
		{
			c=null;
		}
		return c;
	}
}
