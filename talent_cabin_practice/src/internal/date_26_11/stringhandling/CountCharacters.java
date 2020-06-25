/**
 * 
 */
package internal.date_26_11.stringhandling;

import java.util.Scanner;

/**
 * @author Shiwanjalee
 *
 */
public class CountCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the desired String: ");
		String str = s.nextLine();
		CountCharacters obj = new CountCharacters();
		obj.countCharacters(str);
	}
	
	/**
	 * @param To count the total number of characters in a String.
	 */
	public void countCharacters(String pStr)
	{
		int count = 0;
		int length = pStr.length();
		
		for(int i = 0; i< length; i++)
		{
			count+=1;
		}
		System.out.println("Total count of characters: "+count);
	}
}
