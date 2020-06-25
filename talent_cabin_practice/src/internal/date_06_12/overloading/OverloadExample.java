/**
 * 
 */
package internal.date_06_12.overloading;

/**
 * @author Shiwanjalee
 *
 */
public class OverloadExample 
{
	public void display(int a)
	{
		System.out.println("Single parameter: "+a);
	}
	public void display(int a, int b)
	{
		System.out.println("1st parameters: "+a+" & 2nd parameters: "+b);
	}
	public double display(double a)
	{
		System.out.println("Double parameters:"+a);
		return a*a;
	}
	
	
}
