/**
 * 
 */
package internal.date_4.Poly.run_time;

/**
 * @author OneStop
 *
 */
public class Example1 {
	public void display()
	{
		System.out.println("Overriding method");
	}
}
class Example2 extends Example1{
	public void display()
	{
		System.out.println("Overriden method");
	}
}
	class Test
	{
		public static void main(String[] args) {
		Example2 ob = new Example2();
		ob.display();

	}

}
