/**
 * 
 */
package internal.collections;

import java.util.ArrayList;

/**
 * @author Shiwanjalee
 *
 */
public class ArrListEx1 {

	/**
	 * ArrayList to add collection of objects
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Shivy");
		arr.add("Atul");
		arr.add("Cheetu");
		
		System.out.println(arr);
		
		arr.add(2, "Cherry");
		
		System.out.println(arr);

	}

}
