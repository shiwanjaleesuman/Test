/**
 * 
 */
package internal.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Shiwanjalee
 *
 */
public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("India");
		hs.add("China");
		hs.add("Russia");
		hs.add("Pakistan");
		hs.add("Afganistan");
		hs.add("Nepal");

		Iterator itr = hs.iterator();

		System.out.println("Elements in the HashSet: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet ts = new TreeSet();

		ts.addAll(hs);
		System.out.println("Elements in the TreeSet: ");

		itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Adding India again to hashSet..");
		if (hs.add("India")) {
			System.out.println("Successfully added.");
		} else {
			System.out.println("Already exists in the Set...Failed to add.");
		}
	}
}
