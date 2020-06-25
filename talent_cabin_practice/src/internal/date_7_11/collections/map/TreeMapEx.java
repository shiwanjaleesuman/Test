/**
 * 
 */
package internal.date_7_11.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author OneStop
 *
 */
public class TreeMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(200, "Gita");
		map.put(300, "Pawan");
		map.put(400, "Vivek");
		System.out.println("Head-Map: "+map.headMap(200));
		System.out.println("Tail-Map: "+map.tailMap(200));
		System.out.println("Sub-Map: "+map.subMap(100, 300));
	}

}
