/**
 * 
 */
package internal.date_02_12.syncronization;

/**
 * @author Shiwanjalee
 *
 */
class SharedResource {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Printer p = new Printer();
		User u1 = new User(p, "Its 1st user");
		User u2 = new User(p, "Its 2nd user");
		
		u1.start();
		u2.start();
	}

}
