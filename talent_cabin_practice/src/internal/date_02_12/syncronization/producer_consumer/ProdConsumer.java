/**
 * 
 */
package internal.date_02_12.syncronization.producer_consumer;

/**
 * @author Shiwanjalee
 *
 */
public class ProdConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Buffer b = new Buffer();
		Producer p =  new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();
	}
}
