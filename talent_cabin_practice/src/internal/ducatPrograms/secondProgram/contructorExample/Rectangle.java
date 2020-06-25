/**
 * 
 */
package internal.ducatPrograms.secondProgram.contructorExample;

/**
 * Object initialization using constructor
 * 
 * @author OneStop
 *
 */
public class Rectangle 
{
	private int l;
	private int b;
	
	public Rectangle(int length, int bredth)
	{
		l = length;
		b = bredth;
	}
	 public void display()
	 {
		 System.out.println("Length is: "+l);
		 System.out.println("Bredth is: "+b);
	 }
	 
	 public Rectangle()
	 {
		 l = 10;
		 b = 20;
	 }
}