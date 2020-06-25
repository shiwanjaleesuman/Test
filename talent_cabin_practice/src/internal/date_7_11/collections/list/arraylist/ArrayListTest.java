/**
 * 
 */
package internal.date_7_11.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author OneStop
 *
 */
public class ArrayListTest {

	/**
	 * @param An example showing collection-array list example
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Giet");
		al.add("Bhubnesh-Giet");
		al.add("Dps");
		al.add("Vijaya");
		al.add("");
		al.add("AP");
		al.add("Vijaya");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println("ArrayList: "+itr.next());
		}
	}
}
