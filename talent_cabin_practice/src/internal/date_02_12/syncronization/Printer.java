/**
 * 
 */
package internal.date_02_12.syncronization;

/**
 * @author Shiwanjalee
 *
 */
public class Printer {
	/**
	 * To set the message to be printed for 3 stages. 1st header, 2nd is the message
	 * and the last is the footer. And after each stage the Thread is suspended for
	 * half second.
	 * 
	 * @param msg
	 */
	public synchronized void print(String msg) {
		System.out.println("=================");
		try {
			Thread.sleep(500);
			System.out.println(msg);
			Thread.sleep(500);
			System.out.println("-----------------");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
