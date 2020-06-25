/**
 * 
 */
package internal.date_4.Poly.compile_time;

/**
 * @author OneStop
 *
 */
class Calci {
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
}
class Test{
	public static void main(String[] args) {
		Calci obj = new Calci();
		System.out.println((obj.add(10, 20)));
		System.out.println((obj.add(10, 20, 50)));
	}

}
