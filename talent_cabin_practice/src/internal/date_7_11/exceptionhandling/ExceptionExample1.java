/**
 * 
 */
package internal.date_7_11.exceptionhandling;

/**
 * @author Shiwanjalee
 *
 */
public class ExceptionExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			int number = 100/0;
		}
		catch (ArithmeticException e) 
		{
			//handling the exception.
			System.out.println("Handled exception: "+e);
		}
		System.out.println("Exception is now handled.");

	}

}
