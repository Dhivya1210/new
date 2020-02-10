package com.wipro.bus.service;
import java.util.ArrayList;

import com.wipro.bus.bean.ScheduleBean;
import com.wipro.bus.dao.ScheduleDAO;
import com.wipro.bus.util.InputInvalidException;
public class Administrator {
	ScheduleDAO scheduleDAO;
	public String addSchedule(ScheduleBean scheduleBean){
		try{
			if(scheduleBean !=null && scheduleBean.getSource().length() > 2 
					&& scheduleBean.getDestination().length() > 2 &&scheduleBean.getStartTime().length() > 0
					&& scheduleBean.getArrivalTime().length() > 2)
			{
				if(scheduleBean.getSource().equals(scheduleBean.getDestination()))
				{
					return "source and destination same";
				}
				else
				{
					scheduleBean.setScheduleID(
							scheduleDAO.generateID(scheduleBean.getSource(),scheduleBean.getDestination()));
					return scheduleDAO.createSchedule(scheduleBean);
				}
			}
			
			else{
				try{
					throw new InputInvalidException();
				}
				catch(InputInvalidException e)
				{
					return e.toString();
				}
			}
	   }
		catch(Exception ee)
		{
			return "invalid ";
		}
		}
public ArrayList<ScheduleBean> viewSchedule(String Source,String Destination)
{
   	
}
{
	return null;
	
}
}


