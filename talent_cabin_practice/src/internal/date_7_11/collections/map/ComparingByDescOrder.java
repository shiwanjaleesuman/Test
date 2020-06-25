/**
 * 
 */
package internal.date_7_11.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author OneStop
 *
 */
public class ComparingByDescOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();          
		map.put(100,"Shivy");    
		map.put(101,"shinu");    
		map.put(102,"Shubh");
		
		//Returns a Set view of the mappings contained in this map
		map.entrySet()
		//Returns a sequential Stream with this collection as its source  
		.stream()
		//Sorted according to the provided Comparator
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		//Performs an action for each element of this stream
		.forEach(System.out::println);
	}
}
