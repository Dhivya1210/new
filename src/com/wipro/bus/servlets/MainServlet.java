package com.wipro.bus.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bus.bean.ScheduleBean;
import com.wipro.bus.service.Administrator;
public class MainServlet {
	public String addSchedule(HttpServletRequest request)
	{
		
		Administrator ad=new Administrator();
		ScheduleBean scheduleBean=new ScheduleBean();
		scheduleBean.setSource(request.getParameter("source"));
		scheduleBean.setDestination(request.getParameter("Destination"));
		scheduleBean.setStartTime(request.getParameter("StartTime"));
		scheduleBean.setArrivalTime(request.getParameter("ArrivalTime"));
		ad.addSchedule(scheduleBean);
		return null;
	}
	public ArrayList<ScheduleBean> viewSchedule(HttpServletRequest request)
	{
		Administrator ad=new Administrator();
		return ad.viewSchedule(request.getParameter("source"),request.getParameter("destination"));
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException

	{
		String operation=request.getParameter("operation");
		if(operation.equals("newSchedule"))
		{
			String result=addSchedule(request);
			if(result.equals("succes"))
			{
				response.sendRedirect("success.jsp");
			}
			else if(result.equals("fail")){
				response.sendRedirect("error.html");
			}
		}
		if(operation.equals("viewSchedule")){
	}
	{
		return null;
		
	}

}
