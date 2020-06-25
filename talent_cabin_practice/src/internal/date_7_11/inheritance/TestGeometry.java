/**
 * 
 */
package internal.date_7_11.inheritance;

import java.util.Scanner;



/**
 * @author OneStop
 *
 */
public class TestGeometry {

	/**
	 * @param 
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		int l = s.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		int b = s.nextInt();
		int side = s.nextInt();
		System.out.println("Enter the side of square: ");
		Rectangle rect = new Rectangle(l, b);
		System.out.println("Area of rectangle: "+ rect.area(l,b));
		System.out.println("Perimeter of rectangle: "+rect.perimeter(l,b));
		
		Sqaure sq = new Sqaure();
		System.out.println("Area of square: "+ sq.area(side));
		System.out.println("Perimeter of square: "+sq.perimeter(l));
		Geometry geo = new Geometry();
		geo.display(l, b);

	}

}
