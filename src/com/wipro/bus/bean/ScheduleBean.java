package com.wipro.bus.bean;

public class ScheduleBean {
	String ScheduleID;
	String Source;
	String Destination;
	String StartTime;
	String ArrivalTime;
	public ScheduleBean(String scheduleID, String source, String destination, String startTime, String arrivalTime) {
		super();
		ScheduleID = scheduleID;
		Source = source;
		Destination = destination;
		StartTime = startTime;
		ArrivalTime = arrivalTime;
	}
	public ScheduleBean() {
		// TODO Auto-generated constructor stub
	}
	public String getScheduleID() {
		return ScheduleID;
	}
	public void setScheduleID(String scheduleID) {
		ScheduleID = scheduleID;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return "ScheduleBean [ScheduleID=" + ScheduleID + ", Source=" + Source + ", Destination=" + Destination
				+ ", StartTime=" + StartTime + ", ArrivalTime=" + ArrivalTime + "]";
	}
	
	

}
