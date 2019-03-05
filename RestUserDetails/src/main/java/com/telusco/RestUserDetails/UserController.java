package com.telusco.RestUserDetails;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.telusco.UserDao.UserDetailsDao;

@Path("users")
public class UserController 
{
	
	UserDetailsDao us=new UserDetailsDao();
	
	
	@GET
	@Path("user/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("id") int id)
	{
		System.out.println("in getUser Controller");
		return us.getUser(id);
	}
}
