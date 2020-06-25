/**
 * 
 */
package internal.date_7_11.inheritance;

/**
 * @author OneStop
 *
 */
public class Sqaure extends Geometry
{
	public void Sqaure(int side)
	{
		l=side;
	}
	
	public int area(int l)
	{
		return l*l;
	}
	
	public int perimeter(int l)
	{
		return 2*l;
	}
}
