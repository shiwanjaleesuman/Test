/**
 * 
 */
package internal.date_09_12.set;

import java.util.HashSet;

/**
 * @author Shiwanjalee
 *
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> set  = new HashSet<String>();
		set.add("Giet");
		set.add("Bhubnesh-Giet");
		set.add("Dps");
		set.add("Vijaya");
		set.add("");
		set.add("AP");
		set.add("Vijaya");
		
		for(String str: set)
		{
			System.out.println("Hashset objects :"+str);
		}
	}
}
