/**
 * 
 */
package internal.date_06_12.overloading;

/**
 * @author Shiwanjalee
 *
 */
public class OverloadingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		OverloadExample obj = new OverloadExample();
		double rslt;
		obj.display(10);
		obj.display(10, 20);
		rslt = obj.display(2.2);
		System.out.println("Result is: "+rslt);
	}
}
