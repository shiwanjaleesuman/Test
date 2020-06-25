/**
 * 
 */
package internal.date_29_11.multithreading;

/**
 * @author Shiwanjalee
 *
 */
public class WorkerTest {

	/**
	 * @param example showing multi-threading.
	 */
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" branch is started, starting the new branch...");
		Worker work =  new Worker();
		Thread mgr =  new Thread(work);
		mgr.setName("New");
		mgr.start();
		for(int i=5; i>0; i--)
		{
			System.out.println(t.getName()+": "+i);
		}
		try
		{
			t.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
