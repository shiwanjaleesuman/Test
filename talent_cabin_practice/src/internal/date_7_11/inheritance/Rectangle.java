/**
 * 
 */
package internal.date_7_11.inheritance;

/**
 * @author OneStop
 *
 */
public class Rectangle extends Geometry
{
	public Rectangle(int length, int bredth)
	{
		l = length;
		b = bredth;
	}
	
	public int area(int l, int b)
	{
		return l*b;
	}
	
	public int perimeter(int l, int b)
	{
		return 2*(l+b);
	}

}
