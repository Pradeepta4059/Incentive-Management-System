package com.entity;

public class HolidayPack {
    
	private int SlNo;
	private int AchievedTarget;
	private String HolidayName;
	private String Duration;
	private String Destination;
	private String Location;
	private String Amenities;
	
	
	public HolidayPack() {
		// TODO Auto-generated constructor stub
	}


	public HolidayPack(int achievedTarget, String holidayName, String duration, String destination, String location,String amenities) 
	{
		super();
		this.AchievedTarget = achievedTarget;
		this.HolidayName = holidayName;
		this.Duration = duration;
		this.Destination = destination;
		this.Location = location;
		this.Amenities = amenities;
	}


	public HolidayPack(int slNo, int achievedTarget, String holidayName, String duration, String destination,String location, String amenities) 
	{
		super();
		this.SlNo = slNo;
		this.AchievedTarget = achievedTarget;
		this.HolidayName = holidayName;
		this.Duration = duration;
		this.Destination = destination;
		this.Location = location;
		this.Amenities = amenities;
	}


	public int getSlNo() {
		return SlNo;
	}


	public void setSlNo(int slNo) {
		SlNo = slNo;
	}


	public int getAchievedTarget() {
		return AchievedTarget;
	}


	public void setAchievedTarget(int achievedTarget) {
		AchievedTarget = achievedTarget;
	}


	public String getHolidayName() {
		return HolidayName;
	}


	public void setHolidayName(String holidayName) {
		HolidayName = holidayName;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		Duration = duration;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public String getAmenities() {
		return Amenities;
	}


	public void setAmenities(String amenities) {
		Amenities = amenities;
	}
  


	
	
	
}
