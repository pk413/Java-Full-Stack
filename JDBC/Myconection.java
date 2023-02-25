package com;

import java.sql.*;

import javax.management.Query;


public class Myconection {
	

	public static void main(String[] args) {
		
		try {
			System.out.println("Before connection");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sakila","root","root");   
			Statement Stmn = con.createStatement();
			String MyQueryString = "insert into city values(605, 'Bangalore', 91, '2023-02-21 12:00:00');";
			//Stmn.executeUpdate(MyQueryString);
			
			// Retriving the data
			String MyStr = "Select * from City;";
			ResultSet rs =  Stmn.executeQuery(MyStr);
			
			while(rs.next()) {						
				//System.out.println(rs.getString("customer_id")+"..."+rs.getString("first_name")+"..."+rs.getString("last_name"));
				rs.getString("city_id");
				rs.getString("city");
				rs.getString("Country_id");
				rs.getString("last_update");
				
				System.out.println(rs.getString("city_id")+"..."+rs.getString("city")+"..."+ rs.getString("Country_id")+"..."+ rs.getString("last_update")        );
			}

			
			System.out.println("rs="+rs);
			
			System.out.println("record update succesfuly");
			
			con.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
