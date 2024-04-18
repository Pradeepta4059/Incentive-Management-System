package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.entity.Employee;
import com.entity.HolidayPack;

public class HolidayDAO 
{

	private Connection conn;

	public HolidayDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	 // Method to add New HolidayPack
		public boolean addHolidayPack(HolidayPack holiday) 
		{
			boolean f=false;
			try {
				String sql="insert into holiday (AchievedTarget,HolidayName,Duration,Destination,Location,Amenities) values(?,?,?,?,?,?)";
				PreparedStatement ps= conn.prepareStatement(sql);
				
				ps.setInt(1,holiday.getAchievedTarget());
				ps.setString(2,holiday.getHolidayName());
				ps.setString(3,holiday.getDuration());
				ps.setString(4,holiday.getDestination());
				ps.setString(5,holiday.getLocation());
				ps.setString(6,holiday.getAmenities());
				
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
		
		// Method to get all HolidayPack data
		public List<HolidayPack> getAllHolidayPack()
		{
			List<HolidayPack> list=new ArrayList<HolidayPack>();
			HolidayPack E=null;
			try {
				String sql="Select * from holiday";
				PreparedStatement ps=conn.prepareStatement(sql);
				
				ResultSet rs =ps.executeQuery();
				while(rs.next())
				{
					E= new HolidayPack();
					E.setSlNo(rs.getInt(1));
					E.setAchievedTarget(rs.getInt(2));
					E.setHolidayName(rs.getString(3));
					E.setDuration(rs.getString(4));
					E.setDestination(rs.getString(5));
					E.setLocation(rs.getString(6));
					E.setAmenities(rs.getString(7));
					
					list.add(E);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
			//end
			
		}
		
		//get Data in Update page by Empid
		public HolidayPack getSlNo(int SlNo) 
		{
			HolidayPack E=null;
			
			try {
				String sql="Select * from holiday where SlNo=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, SlNo);
				ResultSet rs =ps.executeQuery();
				while(rs.next())
				{
					E=new HolidayPack();
					
					
		
					E.setSlNo(rs.getInt(1));
					E.setAchievedTarget(rs.getInt(2));
					E.setHolidayName(rs.getString(3));
					E.setDuration(rs.getString(4));
					E.setDestination(rs.getString(5));
					E.setLocation(rs.getString(6));
					E.setAmenities(rs.getString(7));
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return E;
			//end
		}
	
		
		
		//update Holiday data
		public boolean updateHolidayPack(HolidayPack holiday) 
		{
			boolean f=false;
			try {
				String sql="update holiday set AchievedTarget=?,HolidayName=?,Duration=?,Destination=?,Location=?,Amenities=? where SlNo=?";
				PreparedStatement ps= conn.prepareStatement(sql);
				
				ps.setInt(1,holiday.getAchievedTarget());
				ps.setString(2,holiday.getHolidayName());
				ps.setString(3,holiday.getDuration() );
				ps.setString(4,holiday.getDestination() );
				ps.setString(5,holiday.getLocation() );
				ps.setString(6,holiday.getAmenities());
				ps.setInt(7, holiday.getSlNo());
			
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
		
		//delete HolidayPack
		public boolean deleteHolidayPack(int SlNo)
		{
			boolean f=false;
			try {
				String sql="delete from holiday where SlNo=?";
				PreparedStatement ps= conn.prepareStatement(sql);
			
				ps.setInt(1,SlNo);
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
		
		
		// Holiday By achieved target
		public List<HolidayPack> getHolidayPackByAt(int achievedtarget)
		{
			List<HolidayPack> list1=new ArrayList<HolidayPack>();
			HolidayPack E1=null;
			try {
				String sql="Select * from holiday where AchievedTarget=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1,achievedtarget);
				ResultSet rs =ps.executeQuery();
				while(rs.next())
				{
					E1= new HolidayPack();
					E1.setSlNo(rs.getInt(1));
					E1.setAchievedTarget(rs.getInt(2));
					E1.setHolidayName(rs.getString(3));
					E1.setDuration(rs.getString(4));
					E1.setDestination(rs.getString(5));
					E1.setLocation(rs.getString(6));
					E1.setAmenities(rs.getString(7));
					
					list1.add(E1);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list1;
			//end
			
		}
		
		
		
}
