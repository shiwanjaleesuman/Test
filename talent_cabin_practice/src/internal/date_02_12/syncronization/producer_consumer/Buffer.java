/**
 * 
 */
package internal.date_02_12.syncronization.producer_consumer;

/**
 * @author Shiwanjalee
 *
 */
public class Buffer 
{
	private int value;
	private boolean produced = false;
	
	public synchronized void produce(int x)
	{
		if(produced)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		value = x;
		System.out.println(value+" is produced.");
		produced = true;
		notify();
	}
	
	public synchronized void consume(int x)
	{
		if(!produced)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		value = x;
		System.out.println(value+" is consumed.");
		produced = false;
		notify();
	}
}
