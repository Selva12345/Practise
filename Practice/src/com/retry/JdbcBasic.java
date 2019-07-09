package com.retry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcBasic {
public static void main(String[] args) {
	try {
		Class.forName("");
		Connection con=null;
		con=DriverManager.getConnection("");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
