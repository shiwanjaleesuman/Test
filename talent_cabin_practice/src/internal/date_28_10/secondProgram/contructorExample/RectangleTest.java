/**
 * 
 */
package internal.date_28_10.secondProgram.contructorExample;

/**
 * @author OneStop
 *
 */
public class RectangleTest {

	/**
	 * To execute and initialize the constructor used in Rectangle class
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(50, 60);
		System.out.println("Dimension of rec1 is: ");
		rec1.display();
		System.out.println("Dimension of rec2 is: ");
		rec2.display();
		
	}

}
