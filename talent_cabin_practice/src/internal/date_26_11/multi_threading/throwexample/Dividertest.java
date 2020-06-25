package internal.date_26_11.multi_threading.throwexample;

/**
 * @author Shiwanjalee
 *
 */
public class Dividertest 
{
	public static int divide(int x, int y) throws ArithmeticException
	{
		try
		{
			int z= x/y;
			System.out.println("divide() is returning the result");
			return z;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide() is showing the Arithmetic Exception...");
			throw(e);
		}
		finally
		{
			System.out.println("finally block of divide() is executed.");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			int a= 10;
			int b= 0;
			int c= divide(a, b);
			System.out.println("Result is: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Following exception is cought in the mai()..."+e);
		}
	}
}
