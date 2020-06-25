/**
 * 
 */
package internal.date_02_12.syncronization.memory;

/**
 * @author Shiwanjalee
 *
 */
public class WriteMemory extends Thread
{
	private Memory memo;
		
	public WriteMemory(Memory m)
	{
		memo = m;
	}
	public void run()
	{
		System.out.println("Writing in the memory started..");
		for(int i=0;i<5;i++)
		{
			memo.write(i);
		}
	}
}
