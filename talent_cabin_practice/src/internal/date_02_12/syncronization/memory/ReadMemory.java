/**
 * 
 */
package internal.date_02_12.syncronization.memory;

/**
 * @author Shiwanjalee
 *
 */
public class ReadMemory extends Thread
{
	private Memory memo;
	
	public ReadMemory(Memory m)
	{
		memo = m;
	}
	public void run()
	{
		System.out.println("Reading from the memory started..");
		for(int i=0;i<5;i++)
		{
			memo.read(i);
		}
	}
}
