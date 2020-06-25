/**
 * 
 */
package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shiwanjalee
 *
 */
public class WelcomeServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String n = request.getParameter("name");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("Welcome "+n);
	}
}
