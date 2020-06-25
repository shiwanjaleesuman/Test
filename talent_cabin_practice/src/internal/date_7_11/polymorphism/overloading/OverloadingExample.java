/**
 * 
 */
package internal.date_7_11.polymorphism.overloading;

/**
 * @author ssuman
 *
 */
public class OverloadingExample {

	/**
	 * @param Overloading example.
	 */
	public static void main(String[] args) 
	{
		OverloadingExample overloadingobj = new OverloadingExample();
		System.out.println("Adding 2 inputs: "+overloadingobj.add(10, 20));
		System.out.println("Adding 3 inputs: "+overloadingobj.add(10, 20, 30));

	}
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}

}
