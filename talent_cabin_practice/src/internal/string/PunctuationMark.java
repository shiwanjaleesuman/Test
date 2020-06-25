/**
 * 
 */
package internal.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class PunctuationMark {
	public void countPunct(String str)
	{
		int count = 0;
		int n = str.length();
		for(int i = 0; i < n; i++)
		{
			if(str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == ';' || str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == ':' || str.charAt(i) == '-')
			{
				count+=1;
			}
		}
		System.out.println("Punctuation count is: "+count);
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		PunctuationMark obj = new PunctuationMark();
		obj.countPunct(str);
	}

}
