/**
 * 
 */
package internal.date_7_11.collections.list.vector;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author OneStop
 *
 */
public class VectorTest {

	/**
	 * @param An example showing collection-Vector example
	 */
	public static void main(String[] args) 
	{
		Vector<String> vec = new Vector<String>();
		vec.add("Giet");
		vec.add("Bhubnesh-Giet");
		vec.add("Dps");
		vec.add("Vijaya");
		vec.add("CV raman");
		vec.add("AP");
		vec.add("Vijaya");
		
		Iterator<String> itr = vec.iterator();
		while(itr.hasNext())
		{
			System.out.println("Vector Object list: "+ itr.next());
		}
	}

}
