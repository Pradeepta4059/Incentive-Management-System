package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.entity.Employee;

public class EmployeeDAO {
	
	private Connection conn;

	public EmployeeDAO(Connection conn) {
		super();
		this.conn = conn;
	}
   // Method to add New Employee
	public boolean addEmployee(Employee employe) 
	{
		boolean f=false;
		try {
			String sql="insert into employe (Name,Email,Password,SalesTarget,AchivedTarget,Incentive,Bonus,HolidayPack) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1,employe.getName());
			ps.setString(2,employe.getEmail());
			ps.setString(3,employe.getPassword());
			ps.setInt(4,employe.getAchievedTarget());
			ps.setInt(5,employe.getAchievedTarget());
			ps.setString(6,employe.getIncentive());
			ps.setString(7,employe.getBonus());
			ps.setString(8,employe.getHPE());
			int i= ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	// Method to get all Employee data
	public List<Employee> getAllEmployee()
	{
		List<Employee> list=new ArrayList<Employee>();
		Employee E=null;
		try {
			String sql="Select * from employe";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				E=new Employee();
				
				E.setEmpId(rs.getInt(1));
				E.setName(rs.getString(2));
				E.setEmail(rs.getString(3));
				E.setPassword(rs.getString(4));
				E.setSalesTarget(rs.getInt(5));
				E.setAchievedTarget(rs.getInt(6));
				E.setIncentive(rs.getString(7));
				E.setBonus(rs.getString(8));
				E.setHPE(rs.getString(9));
				list.add(E);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return list;
		//end
		
	}
	
	//get Data in Update page by Empid
	public Employee getEmpById(int EmpId) 
	{
		Employee E=null;
		
		try {
			String sql="Select * from employe where EmpId=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, EmpId);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				E=new Employee();
				
				E.setEmpId(rs.getInt(1));
				E.setName(rs.getString(2));
				E.setEmail(rs.getString(3));
				E.setPassword(rs.getString(4));
				E.setSalesTarget(rs.getInt(5));
				E.setAchievedTarget(rs.getInt(6));
				E.setIncentive(rs.getString(7));
				E.setBonus(rs.getString(8));
				E.setHPE(rs.getString(9));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return E;
		//end
	}
	//update Employee data
	public boolean updateEmployee(Employee employe) 
	{
		boolean f=false;
		try {
			String sql="update employe set Name=?,Email=?,Password=?,SalesTarget=?,AchivedTarget=?,Incentive=?,Bonus=?,HolidayPack=? where EmpId=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1,employe.getName());
			ps.setString(2,employe.getEmail());
			ps.setString(3,employe.getPassword());
			ps.setInt(4,employe.getAchievedTarget());
			ps.setInt(5,employe.getAchievedTarget());
			ps.setString(6,employe.getIncentive());
			ps.setString(7,employe.getBonus());
			ps.setString(8,employe.getHPE());
			ps.setInt(9,employe.getEmpId());
			int i= ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	//delete Employe
	public boolean deleteEmployee(int EmpId)
	{
		boolean f=false;
		try {
			String sql="delete from employe where EmpId=?";
			PreparedStatement ps= conn.prepareStatement(sql);
		
			ps.setInt(1,EmpId);
			int i= ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	// Get Employee by Email and Password
	
	public List<Employee> getEmpByEmailPassword(String Email,String Password) 
	{
		List<Employee> list=new ArrayList<Employee>();
		Employee E=null;
		
		try {
			String sql="Select * from employe where Email=? and Password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, Email);
			ps.setString(2, Password);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				E=new Employee();
				
				E.setEmpId(rs.getInt(1));
				E.setName(rs.getString(2));
				E.setEmail(rs.getString(3));
				E.setPassword(rs.getString(4));
				E.setSalesTarget(rs.getInt(5));
				E.setAchievedTarget(rs.getInt(6));
				E.setIncentive(rs.getString(7));
				E.setBonus(rs.getString(8));
				E.setHPE(rs.getString(9));
				list.add(E);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		//end
	}

}
