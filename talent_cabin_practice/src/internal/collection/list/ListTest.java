/**
 * 
 */
package internal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Shiwanjalee
 *
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("India");
		list.add("Goaaa");
		list.add("China");
		list.add("Russia");
		list.add("Pakistan");
		list.add("Afganistan");
		list.add(1, "Nepal");
		
		list.remove("Goaaa");

		/*if(list.add("Goaaa"))
		{
			System.out.println("Successfully added at: "+list.indexOf("Goaaa"));
		}
		else
		{
			System.out.println("Failed to add.");
		}*/
		
		Iterator itr = list.iterator();
		
		itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
