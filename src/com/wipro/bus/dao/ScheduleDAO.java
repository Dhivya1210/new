package com.wipro.bus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.wipro.bus.bean.ScheduleBean;
import com.wipro.bus.util.DBUtil;
public class ScheduleDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public String createSchedule(ScheduleBean scheduleBean) throws ClassNotFoundException, SQLException
	{
		con=DBUtil.getDBConnection();
		try{
			ps=con.prepareStatement("insert into SCHEDULE values(?,?,?,?,?)");
			ps.setString(1, scheduleBean.getScheduleID());
			ps.setString(2, scheduleBean.getSource());
			ps.setString(3, scheduleBean.getDestination());
			ps.setString(4, scheduleBean.getStartTime());
			ps.setString(5, scheduleBean.getArrivalTime());
			if(ps.executeUpdate()>0){
				return "SUCCESS";
				}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return null;
	}
	public String generateID(String Source,String Destination) throws ClassNotFoundException, SQLException
	{
	 con=DBUtil.getDBConnection();
	 int id=0;
	 try{
		 ps=con.prepareStatement("select Schedule_seq.nextval from dual");
		 rs.next();
		 id=rs.getInt(1);
	 }
	 catch(SQLException e)
	 {
		 System.out.println(e);
	 }
	 return Source.substring(0,2).toUpperCase()+Destination.substring(0,2).toUpperCase()+id;
	}
public ArrayList<ScheduleBean> viewSchedule(String Source,String Destination) throws ClassNotFoundException, SQLException
{
	ArrayList<ScheduleBean> al=new ArrayList<ScheduleBean>();
	con=DBUtil.getDBConnection();
	try
	{
		ps=con.prepareStatement("select * from Schedule where Source="+Source+" and Destination="+Destination);
		rs=ps.executeQuery();
		while(rs.next())
		{
			ScheduleBean s=new ScheduleBean();
			s.setScheduleID(rs.getString(1));
			s.setSource(rs.getString(2));
			s.setDestination(rs.getString(3));
			s.setStartTime(rs.getString(4));
			s.setArrivalTime(rs.getString(5));
			al.add(s);
		}
		if(al.isEmpty()){
			return null;
		}
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	return null;
}     
}
