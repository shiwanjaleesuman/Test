/**
 * 
 */
package internal.date_02_12.syncronization.memory;

/**
 * @author Shiwanjalee
 *
 */
public class Memory 
{
	private int value;
	private boolean wrote = false;
	
	public synchronized void write(int x)
	{
		if(wrote)
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
		wrote = true;
		notify();
	}
	
	public synchronized void read(int x)
	{
		if(!wrote)
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
		wrote = false;
		notify();
	}
}
