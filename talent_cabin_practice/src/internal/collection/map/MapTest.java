/**
 * 
 */
package internal.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Shiwanjalee
 *
 */
public class MapTest {

	/**
	 * Enter the country name(key) to get its capital city(value) from the Map entry.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Afganistan", "Kabul");
		map.put("Bangladesh", "Dhaka");
		map.put("Nepal", "Kathamandu");

		System.out.println("There are " + map.size() + " entries in the Map.");
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the country name to find its capital city..");
			String key = in.nextLine();
			Object value = map.get(key);
			String ans;

			if (value == null) {
				System.out.println("Country not added in the map, want to add, yes/no?");
				ans = in.nextLine();
				if (ans.equalsIgnoreCase("yes")) {
					System.out.println("Enter the capital :");
					value = in.nextLine();
					map.put(key, value);
				}
			} else {
				System.out.println("Capital is :" + value);
			}

			ans = in.nextLine();
			if (ans.equalsIgnoreCase("no")) {
				break;
			}

			Set set = map.entrySet();
			Iterator itr = set.iterator();
			System.out.println("Elements in the Map are: ");
			while (itr.hasNext()) {
				Map.Entry entry = (Map.Entry) itr.next();
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}
		}
	}

}
