package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void empAdd(DataSource ds,employee e) throws SQLException, ClassNotFoundException
	{		
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into employee1 values('"+e.getEid()+"','"+e.getEaddres()+"')");
        System.out.println("added Successfully");
	}
}
