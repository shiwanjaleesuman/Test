/**
 * 
 */
package internal.date_02_12.syncronization.producer_consumer;

/**
 * @author Shiwanjalee
 *
 */
public class Consumer extends Thread
{
	private Buffer buffer;
		
		public Consumer(Buffer b)
		{
			buffer = b;
		}
		public void run()
		{
			System.out.println("Consumer started..");
		for(int i=0;i<5;i++)
		{
			buffer.consume(i);
		}
	}
}
