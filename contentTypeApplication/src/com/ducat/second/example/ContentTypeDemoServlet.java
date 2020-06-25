/**
 * 
 */
package com.ducat.second.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * @author Shiwanjalee
 *
 */
public class ContentTypeDemoServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String format = request.getParameter("format");
		
		PrintWriter out = response.getWriter();
		
		if(format.equals("text"))
		{
			//Now, the content type of the response is set
			response.setContentType("text/plain");
		}
		else if (format.equals("html")) 
		{
			//Now, the content type of the response is set
			response.setContentType("text/html");
		}
		else 
		{
			//Now, the content type of the response is set
			response.setContentType("application/msword");
		}
		
		out.println("<h3>It is h3 heading.</h3>");
		out.println("<h4>It is h4 heading.</h4>");
		out.println("<h5>It is h5 heading.</h5>");
		out.println("<h6>It is h6 heading.</h6>");
		out.close();
	}

}
