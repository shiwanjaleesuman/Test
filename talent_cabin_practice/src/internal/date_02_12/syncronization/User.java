/**
 * 
 */
package internal.date_02_12.syncronization;

/**
 * @author Shiwanjalee
 *
 */
class User extends Thread 
{
	Printer tPrinter;
	String tMsg;
	
	public User(Printer p, String m)
	{
		tPrinter = p;
		tMsg = m;
	}

	public void run()
	{
		Printer.print(tMsg);
	}
}
