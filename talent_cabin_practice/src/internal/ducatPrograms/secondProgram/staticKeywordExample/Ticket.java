/**
 * 
 */
package internal.ducatPrograms.secondProgram.staticKeywordExample;

/**
 * Tickets(here) represents an object. Each Ticket has a unique id and value(as price).
 * total value of ticket and stamps(counter) here represents a common value of the class.
 * 
 * @author OneStop
 *
 */
public class Ticket 
{
	
	/**
	 * Common class attribute
	 * 
	 */
	private int no, value;
	
	
	/**
	 * Object/ instance attribute
	 * 
	 */
	private static int total, counter;
	
	// class initializer
	static
	{
		total = 0;
		counter = 0;
	}
	
	//Object initializer
	public Ticket(int v)
	{
		no = ++counter;
		value = v;
		total = total + value;
	}
	
	//class behaviour
	public static void summary()
	{
		System.out.println(counter+" tickets of Rs. "+ total +" are sold.");
	}
	
	//object behaviour
	public void display()
	{
		System.out.println("It is ticket "+ no +" of Rs. "+ value);
	}
	
}
