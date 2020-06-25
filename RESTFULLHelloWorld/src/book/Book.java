/**
 * 
 */
package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Shiwanjalee
 *
 */

@Path("/book")
public class Book {
	
	/**
	 * generate text is response
	 * @return
	 */
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String displayXMLMsg()
	{
		String response = "<?xml version='1.0'?>" + "<hello> Hello Jersey </hello>";
		return response;
	}*/
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	public String displayXMLMsg(@PathParam("name") String name)
	{
		String response = "<?xml version='1.0'?>" + "<hello> Hello"+ name+"</hello>";
		return response;
	}
	
}
