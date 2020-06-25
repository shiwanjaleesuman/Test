/**
 * 
 */
package internal.date_4.Poly.compile_time;

/**
 * @author OneStop
 *
 */
public class XYZ {

	public void add(int a, int b)
	{
		System.out.println("Sum:"+(a+b));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Sum:"+(a+b+c));
	}
}
class Test1{
	public static void main(String[] args) {
		XYZ ob = new XYZ();
		ob.add(10, 20);
		ob.add(12, 20, 30);
	}
}
