package com.capgemini.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.EmployeeRepositoryImplementation;

public class EmployeeServiceImplementation implements EmployeeService
{
	@Override
	public boolean AddEmployee(Employee e) 
	{
		String query="INSERT INTO EMPLOYEE VALUES(?,?)";
		EmployeeRepository repo=new EmployeeRepositoryImplementation();
		int count=repo.AddQuery(query, e);
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	@Override
	public Employee updateEmployee(Employee e) 
	{
		String query="UPDATE EMPLOYEE SET Ename=? WHERE (ID=?)";
		EmployeeRepository repo=new EmployeeRepositoryImplementation();
		int count=repo.updateQuery(query,e);
		if(count==1)
		{
			Employee e2=GetEmployee(e.getID());
			return e2;
		}
		else
		{
			return null;
		}
	}
	@Override
	public Employee GetEmployee(int ID) 
	{
		Employee e=new Employee();
		EmployeeRepository repo=new EmployeeRepositoryImplementation();
		String query="SELECT * FROM EMPLOYEE WHERE ID=" +ID;
		ResultSet r=repo.RetrieveQuery(query);
		try 
		{
			r.next();
			e.setID(r.getInt(1));
			e.setEname(r.getString(2));
		}
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return e;	
	}
	@Override
	public List<Employee> GetEmployees() 
	{
		List<Employee>emp=new ArrayList<Employee>();
		EmployeeRepository repo=new EmployeeRepositoryImplementation();
		String query="SELECT * FROM EMPLOYEE";
		ResultSet r=repo.RetrieveQuery(query);
		try 
		{
			while(r.next())
			{
				Employee e=new Employee();
				e.setID(r.getInt(1));
				e.setEname(r.getString(2));
				emp.add(e);	
			}
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return emp;
	}
	@Override
	public boolean deleteEmployee(int ID) 
	{
		EmployeeRepository repo=new EmployeeRepositoryImplementation();
		String query="DELETE FROM EMPLOYEE WHERE ID=" +ID;
		int count=repo.deleteQuery(query);
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
