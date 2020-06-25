/**
 * 
 */
package internal.date_26_11.multi_threading.userdefined;

/**
 * @author s.suman
 *
 */
public class MultithreadingTest extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread is:"+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			System.out.println("exception caught is: "+e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Current thread in main():"+Thread.currentThread());
		
		//Thread t = new Thread();
		//t.setName("Main Thread");
		//System.out.println("Current thread in main():"+Thread.currentThread().getName());
		
		int n = 3;
		for(int i = 0; i < n; i++)
		{
			MultithreadingTest obj = new MultithreadingTest();
			obj.start();
		}
	}
}
