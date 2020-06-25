/**
 * 
 */
package internal.date_7_11.polymorphism.overriding;

/**
 * @author OneStop
 *
 */
public class AnimalEatingHabit 
{
	void eat()
	{
		System.out.println("Eating habits of animals.");
	}
	
	public static void main(String[] args) {
		Lion lionObj = new Lion();
		lionObj.eat();
	}
}
