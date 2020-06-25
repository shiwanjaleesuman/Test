/**
 * 
 */
package internal.ducatPrograms.secondProgram.staticKeywordExample.random;

/**
 * @author OneStop
 *
 */
class A
{
	static
	{
		System.out.println("A class is loaded");
	}
	public A()
	{
		System.out.println("Object of A class is created");
	}
}

class B
{
	static
	{
		System.out.println("B class is loaded");
	}
	
	public static void display()
	{
		System.out.println("display() of B class is invoked.");
	}
}

class C
{
	static int value;
	static
	{
		System.out.println("C class is loaded");
		value = 10;
	}
}

public class D 
{
	static
	{
		System.out.println("D class is loaded");
	}

	public static void main(String[] args) 
	{
		System.out.println("Creating object of A class..");
		A ob = new A();
		
		System.out.println("Invoking display() of B class");
		B.display();
		
		System.out.println("C value is :"+ C.value);
		
		System.out.println("Creating another object of A class...");
		A obj2 = new A();
	}

}
