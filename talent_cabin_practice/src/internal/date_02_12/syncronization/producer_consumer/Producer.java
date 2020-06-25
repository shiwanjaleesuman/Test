/**
 * 
 */
package internal.date_02_12.syncronization.producer_consumer;

/**
 * @author Shiwanjalee
 *
 */
public class Producer extends Thread
{
	private Buffer buffer;
	
	public Producer(Buffer b)
	{
		buffer = b;
	}
	public void run()
	{
		System.out.println("Producer started..");
		for(int i=0;i<5;i++)
		{
			buffer.produce(i);
		}
	}
}
