/**
 * 
 */
package internal.date_7_11.collections.set;

import java.util.TreeSet;

/**
 * @author OneStop
 *
 */
public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Giet");
		set.add("Bhubnesh-Giet");
		set.add("Dps");
		set.add("Vijaya");
		set.add("");
		set.add("AP");
		set.add("Vijaya");
		
		for(String str: set)
		{
			System.out.println("TreeSet objects: "+str);
		}
	}
}
