package com.sangamone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConectivity1 {

	public static void main(String[] args)throws ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/database1";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getString(1));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
