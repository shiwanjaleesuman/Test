/**
 * 
 */
package internal.date_09_12.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Shiwanjalee
 *
 */
public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Giet");
		set.add("Bhubnesh-Giet");
		set.add("Dps");
		set.add("Vijaya");
		set.add("");
		set.add("AP");
		set.add("Vijaya");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println("LinkedHashset objects: "+itr);
		}
	}
}
