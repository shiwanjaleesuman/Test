/**
 * 
 */
package internal.ducatPrograms.secondProgram.contructorExample;

/**
 * @author OneStop
 *
 */
public class RectangleTest {

	/**
	 * To execute and initialize the contructor used in Rectangle class
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
