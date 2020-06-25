/**
 * 
 */
package internal.date_02_12.indirect_implementation;

/**
 * @author Shiwanjalee
 *
 */
public class Indirect 
{

	/**
	 * @param 
	 */
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" Stating a new branch..");
		MyThread workCumMgr = new MyThread();
		workCumMgr.setName("New");
		workCumMgr.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main :"+i);
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
