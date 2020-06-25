/**
 * 
 */
package internal.string;

import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class StringPalindrome {
	public void stringPalindrome(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String reverse = sb.toString();
		if(str.equals(reverse))
		{
			System.out.println("Palindrome String: "+str);
		}
		else
		{
			System.out.println("Not Palindrome string");
		}
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		StringPalindrome obj = new StringPalindrome();
		obj.stringPalindrome(str);
	}

}
