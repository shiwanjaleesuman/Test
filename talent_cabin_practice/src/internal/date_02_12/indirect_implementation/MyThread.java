/**
 * 
 */
package internal.date_02_12.indirect_implementation;

/**
 * @author Shiwanjalee
 *
 */
public class MyThread extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" branch started..");
		for(int i=0;i<5;i++)
		{
			System.out.println("run :"+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(t.getName()+" branch is completed.");
	}
}
