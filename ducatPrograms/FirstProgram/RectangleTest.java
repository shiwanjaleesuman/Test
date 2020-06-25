/**
 * 
 */
package internal.ducatPrograms.FirstProgram;

//import internal.ducatPrograms.Rectangle;

/**
 * @author OneStop
 *
 */
public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		System.out.println("The default dimension of rectangle r1: ");
		r1.display();
		r2.display();
		//r1.l = 2;
		//r2.l = 5;
		
		r1.setDimension(5, 10);
		r2.setDimension(10, 20);
		
		System.out.println("Dimension of r1: ");
		r1.display();
		System.out.println("Dimension of r2: ");
		r2.display();
		
		int a = r1.area();
		System.out.println("Area of r1 is"+a);
		
		System.out.println("Area of r2 is"+ r2.area());
		
		System.out.println("Perimeter of r1 is: "+r1.perimeter());
		System.out.println("Perimeter of r2 is: "+r2.perimeter());
	}
}
