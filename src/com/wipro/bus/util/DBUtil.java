package com.wipro.bus.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	private static Connection con=null;
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.100.13:1521:orcl","l17314","pass321");
		return con;
		
	}

}
