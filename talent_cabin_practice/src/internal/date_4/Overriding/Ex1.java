/**
 * 
 */
package internal.date_4.Overriding;

/**
 * @author OneStop
 *
 */
class Ex1 {
	
	public void Display() {
		System.out.println("Ex1");
	}
}
class Ex2 extends Ex1{
	public void Display() {
		System.out.println("Ex2");
	}
}
class Test{
	public static void main(String args[]) {
		//Ex1 ob1= new Ex1();
		Ex2 ob2= new Ex2();
		//ob1.Display();
		ob2.Display();
		
	}
}
