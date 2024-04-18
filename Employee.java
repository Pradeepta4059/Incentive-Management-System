package com.entity;

public class Employee {
	
	private int EmpId;
	private String Name;
	private String Email;
	private String Password;
	private int SalesTarget;
	private int AchievedTarget;
	private String Incentive="0";
	private String Bonus="None";
	private String HPE="No";
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, String password, int salesTarget, int achievedTarget) {
		super();
		this.Name = name;
		this.Email = email;
		this.Password = password;
		this.SalesTarget = salesTarget;
		this.AchievedTarget = achievedTarget;
		
		switch(SalesTarget)
		{
		case 10000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="1.5%";
			}
		   break;	
		case 20000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="3%";
			}
		   break; 
		case 30000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="3.5%";
				this.Bonus="$1000";
			}
		   break;
		case 50000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="5%";
				this.HPE="Yes";
			}
		   break;
		  default :
			  if(SalesTarget > 50000 && SalesTarget <= AchievedTarget) 
			  {
				  this.Incentive="5%";
				  this.HPE="Yes";
			  }
		}
		
		
		
	}
	// Constructer with Empid
	
	public Employee(int Empid,String name, String email, String password, int salesTarget, int achievedTarget) {
		super();
		this.EmpId=Empid;
		this.Name = name;
		this.Email = email;
		this.Password = password;
		this.SalesTarget = salesTarget;
		this.AchievedTarget = achievedTarget;
		
		switch(SalesTarget)
		{
		case 10000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="1.5%";
			}
		   break;	
		case 20000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="3%";
			}
		   break; 
		case 30000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="3.5%";
				this.Bonus="$1000";
			}
		   break;
		case 50000:
			if(SalesTarget <= AchievedTarget )
			{
				this.Incentive="5%";
				this.HPE="Yes";
			}
		   break;
		  default :
			  if(SalesTarget > 50000 && SalesTarget <= AchievedTarget) 
			  {
				  this.Incentive="5%";
				  this.HPE="Yes";
			  }
		}
	}

	// getter & setter
	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getSalesTarget() {
		return SalesTarget;
	}

	public void setSalesTarget(int salesTarget) {
		SalesTarget = salesTarget;
	}

	public int getAchievedTarget() {
		return AchievedTarget;
	}

	public void setAchievedTarget(int achievedTarget) {
		AchievedTarget = achievedTarget;
	}

	public String getIncentive() {
		return Incentive;
	}

	public void setIncentive(String incentive) {
		Incentive = incentive;
	}

	public String getBonus() {
		return Bonus;
	}

	public void setBonus(String bonus) {
		Bonus = bonus;
	}

	public String getHPE() {
		return HPE;
	}

	public void setHPE(String hPE) {
		HPE = hPE;
	}
	
	
	
	
	
	

}
