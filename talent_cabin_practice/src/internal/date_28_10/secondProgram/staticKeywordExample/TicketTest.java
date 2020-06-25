/**
 * 
 */
package internal.date_28_10.secondProgram.staticKeywordExample;

/**
 * @author OneStop
 *
 */
public class TicketTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Selling tickets...");
		Ticket obj1 = new Ticket(100);
		Ticket obj2 = new Ticket(200);
		
		//Static methods are called directly by their class name
		Ticket.summary();
		System.out.println("Details of sold tickets");
		obj1.display();
		obj2.display();
	}
}
