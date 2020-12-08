package com.src;

import java.util.Scanner;

import javax.sql.DataSource;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
           Scanner sc=new Scanner(System.in);
		
		ApplicationContext ac=new ApplicationContextConfig(ApplicationContextConfig.class);
		DataSource jf=(DataSource) ac.getBean("mysql");
		
		System.out.println("1. Add employee");
		System.out.println("2. Delete employee");
		System.out.println("3. Update employee");
		System.out.println("4. Display employee");
		System.out.println("Enter your choices");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				Employee e=new Employee();
				System.out.println("Enter employee name");
				e.setName(sc.next());
				System.out.println("Enter employee address");
				e.setAddress(sc.next());
				Insert.empAdd(jf,e);
				break;
			}
			case 2:
			{
				System.out.println("Enter eid be deleted");
				String name=sc.next();
				Delete.empDelete(jf,eid);
				break;
			}
			case 3:
			{
				System.out.println("Enter employee name");
				String name=sc.next();
				Update.empUpdate(jf,name);
				break;
			}
			case 4:
			{
				System.out.println("Enter employee name");
				String name=sc.next();
				Display.Displayemp(jf,name);
				break;
			}
			default:
				System.out.println("Invalid Choice!!");
				break;
		}
		
	}
	

}
