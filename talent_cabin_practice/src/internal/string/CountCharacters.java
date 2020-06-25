/**
 * 
 */
package internal.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class CountCharacters {
	public void countCharacters(String str)
	{
		int count = 0;
		int n = str.length();
		for(int i=0; i<n; i++)
		{
			count+=1;
		}
		System.out.println("Count of character: "+count);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the desired String: ");
		String str = s.nextLine();
		CountCharacters obj = new CountCharacters();
		obj.countCharacters(str);
	}
}
