package com.servlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	
	static Connection connect;
	
	private Jdbc() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/innovators","root","Anarsi@919");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getinstance() {
		return connect;
		
	}
	public static void main(String[] args) {
	
		System.out.println(Jdbc.getinstance());
	}

}


