/**
 * 
 */
package internal.date_06_12.polymorphism;

/**
 * @author Shiwanjalee
 *
 */
public class Horse extends Animal
{
	public void animalSound() 
	{
		System.out.println("Neigh");
	}
	public static void main(String[] args) 
	{
		Animal aniObj = new Horse();
		aniObj.animalSound();
	}
}
