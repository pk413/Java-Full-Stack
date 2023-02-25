package com;

import java.sql.*;
import javax.management.Query;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class MyCountry {

	public static void main(String[] args) {
		try {
			System.out.println("Before connection");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sakila","root","root");   
			Statement Stmn = con.createStatement();
			
			String myStr = "Select * from Country";
			ResultSet rs = Stmn.executeQuery(myStr);
			
			while(rs.next()) {
				rs.getString("Country_id");
				rs.getString("Country");
				System.out.println("Country="+rs.getString("Country"));
			}
			System.out.println("......................");
			con.close();			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
