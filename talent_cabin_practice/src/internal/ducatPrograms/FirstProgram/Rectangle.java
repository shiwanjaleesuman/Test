/**
 * 
 */
package internal.ducatPrograms.FirstProgram;

/**
 * @author OneStop
 *
 */
public class Rectangle 
{
	private int l;
	private int b;
	
	public void display()
	{
		System.out.println("length: "+l);
		System.out.println("Bredth:"+b);
	}
	
	public int area()
	{
		return l*b;
	}
	
	public int perimeter()
	{
		return 2*(l+b);
	}
	
	public void setDimension(int x, int y)
	{
		l= x;
		b=y;
	}
	

}
