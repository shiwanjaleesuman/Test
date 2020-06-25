/**
 * 
 */
package com.ducat.first.example;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * @author Shiwanjalee
 *
 */
public class AdderServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a+b;
		
		//for generating the dynamic response, we need a o/p stream PrintWritter  class
		PrintWriter out = response.getWriter();
		
		//Now, the content type of the response is set
		response.setContentType("text/html");
		
		out.println("<h3>Sum is : "+c+"</h3>");
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		
		rd.include(req, response);
		out.close();
	}
	 
	
}
