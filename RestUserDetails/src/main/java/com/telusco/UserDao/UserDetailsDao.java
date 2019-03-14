package com.telusco.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.telusco.RestUserDetails.User;
public class UserDetailsDao 
{
	Connection con = null;
	
	public UserDetailsDao()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/RestData?user=root&password=Nani15420904!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("in getUserDao");
		String sql="Select * from UserDetails where Id="+id;

		
		User use = new User();
		try {
			System.out.println("before statement");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				System.out.println("checking the values in dao");
				use.setId(rs.getInt(1));
				use.setName(rs.getString(2));
				use.setProfession(rs.getString(3));
				use.setPlace(rs.getString(4));
				System.out.println("checked everything in dao");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("returning value in dao");
		return use;
	}
}
