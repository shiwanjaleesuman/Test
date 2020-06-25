/**
 * 
 */
package com.telusko.first.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shiwanjalee
 *
 */
public class SquareServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k = (int) req.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println("Sum is: "+k);
		
		k = k*k;
		
		out.println("Square of the total Sum is: "+k);
	}
}
