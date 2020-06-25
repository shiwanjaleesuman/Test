/**
 * 
 */
package com.telusko.first.example;

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
public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		
		int c = a+b;
		
		request.setAttribute("k", c);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h3>Result is: "+c+"</h3>");
		
		RequestDispatcher rd = request.getRequestDispatcher("square");
		rd.forward(request, response);
		
		out.close();
	}
}
