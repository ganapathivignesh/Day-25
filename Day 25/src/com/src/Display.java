package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display {

	public static void Displayemp(DataSource ds,String name) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee1 where eid="+eid+"");

		while(rs.next())
		{
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getString("eaddres"));

		}
	}
}
