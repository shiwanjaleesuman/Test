/**
 * 
 */
package internal.date_09_12.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Shiwanjalee
 *
 */
public class HashMapForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Giet");
		map.put(200, "Bhubnesh-Giet");
		map.put(300, "Dps");
		map.put(400, "Vijaya");
		map.put(500, "");
		map.put(600, "AP");
		//map.put(, );
		map.put(900, "");
		map.put(700, "Vijaya");
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
