/**
 * 
 */
package internal.date_26_11.multi_threading.divider;

import java.util.Scanner;

/**
 * @author Shiwanjalee
 *
 */
public class Divider {

	/**
	 * @param An Exception Example
	 */
	public static void main(String[] args) 
	{
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the 1st number: ");
			int n1 = input.nextInt();
			System.out.println("Enter the 2nd number: ");
			int n2 = input.nextInt();
			int result = n1/n2;
			System.out.println("After division the result is: "+result);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("2nd no must be a non-zero.");
		}
		catch (NumberFormatException e) 
		{
			System.out.println("I/P must be numeric");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No I/P is provided!");
		}*/
		catch(Exception e)
		{
			System.out.println("handled exception "+e);
		}
	}

}
