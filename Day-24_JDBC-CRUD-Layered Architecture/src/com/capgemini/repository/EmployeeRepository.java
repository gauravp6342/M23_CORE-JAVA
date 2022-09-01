package com.capgemini.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.capgemini.entities.Employee;

public interface EmployeeRepository 
{
	Statement createStatement();
	PreparedStatement createPrepareStatement(String query);
	public ResultSet RetrieveQuery(String query);//Retrieve
	public int AddQuery(String query,Employee e);//Add
	public int updateQuery(String query,Employee e);//Update
	public int deleteQuery(String query);//Delete
}
