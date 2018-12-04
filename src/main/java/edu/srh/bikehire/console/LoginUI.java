package edu.srh.bikehire.console;

import java.util.Scanner;

import edu.srh.bikehire.exception.BikeHireSystemException;
import edu.srh.bikehire.service.core.Entity;
import edu.srh.bikehire.service.core.impl.LoginCredential;
import edu.srh.bikehire.service.impl.DBBasedLoginService;

public class LoginUI {

	private String username ;
	
	private String password;
	
	public boolean login()
	{
		System.out.println("login");
		
		Scanner in = null;
		try
		{			
			in = new Scanner(System.in);
			readInputs(in);
			
			//Call Login API using username and password
			LoginCredential credentials = new LoginCredential();
			credentials.setUserName(username);
			credentials.setPassword(password);
			DBBasedLoginService loginService = new DBBasedLoginService();
			Entity loggedInEntity = loginService.authenticate(credentials);
			
			if(loggedInEntity == null)
			{
				//TODO: resolve
				throw new BikeHireSystemException(-1);
			}
			
			return true;
		}
		catch(Exception exception)
		{
			//TODO: Handle exception and show message
			return false;
		}
		finally
		{
			if(in != null)
			{
				in.close();
			}
		}
	}
	
	private void readInputs(Scanner in)
	{
		System.out.println("Enter UserName : ");
		username=in.nextLine();
		System.out.println("Enter password: ");
		password=in.nextLine();
	}

}
