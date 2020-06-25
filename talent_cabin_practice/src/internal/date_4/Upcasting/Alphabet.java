/**
 * 
 */
package internal.date_4.Upcasting;

/**
 * @author OneStop
 *
 */
public class Alphabet {

	class A{
		public void display() {
			System.out.println("A");
		}
	}
	class Bee extends A {
		public void display() {
			System.out.println("B");
		}
		public void display2() {
			System.out.println("Hi B");
		}
	}
	public static void main(String[] args) {
		//A a = new A();
		Bee b = new Bee();
		A a = (A)b;
		b.display();
		a.display();
		

	}

}
