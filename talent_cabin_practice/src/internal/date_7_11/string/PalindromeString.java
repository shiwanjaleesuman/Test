/**
 * 
 */
package internal.date_7_11.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the original String: ");
		String str = s.nextLine();
		PalindromeString obj = new PalindromeString();
		obj.palindromeString(str);
	}
	
	public void palindromeString(String pStr)
	{
		StringBuffer sb =  new StringBuffer(pStr);
		sb.reverse();
		String reverse = sb.toString();
		if(pStr.equals(reverse))
		{
			System.out.println("Its a Palindrome String: "+pStr);
		}
		else
		{
			System.out.println("Not a palindrome String.");
		}
	}

}
