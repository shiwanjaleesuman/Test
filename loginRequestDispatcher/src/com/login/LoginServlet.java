/**
 * 
 */
package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shiwanjalee
 *
 */
public class LoginServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		String n = request.getParameter("name");
		String p = request.getParameter("pass");
		
		response.setContentType("text/Html");
		
		PrintWriter out = response.getWriter();
		
		
		if(p.equals("pass@1234"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("welcomePage");
			rd.forward(request, response);
		}
		else
		{
			out.println("User Name or Password mis-matched!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}
	
	public static void changeBoolean(boolean pCheck)
	{
		pCheck=true;
	}
	public static void main(String[] args)
	{
		  boolean tCheck=false;
		  changeBoolean(tCheck);
		  System.out.println(tCheck);
	}

}
