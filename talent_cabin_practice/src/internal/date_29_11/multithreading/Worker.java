/**
 * 
 */
package internal.date_29_11.multithreading;

/**
 * @author Shiwanjalee
 *
 */
public class Worker implements Runnable
{

	/**
	 * @param example showing multi-threading.
	 */
	
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" branch is started.");
		for(int i=1;i<5;i++)
		{
			System.out.println(t.getName()+": "+i);
			try
			{
				t.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(t.getName()+" branch is completed.");
	}
}
