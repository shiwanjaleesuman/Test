/**
 * 
 */
package internal.date_7_11.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author OneStop
 *
 */
public class LinkedListTest {

	/**
	 * @param An example showing collection-array list example
	 */
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Giet");
		list.add("Bhubnesh-Giet");
		list.add("Dps");
		list.add("Vijaya");
		list.add("CV raman");
		list.add("AP");
		list.add("Vijaya");
		
		Iterator<String> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println("LinkedList:"+itr.next());
			}
	}
}
