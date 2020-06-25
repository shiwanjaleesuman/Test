/**
 * 
 */
package internal.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author OneStop
 *
 */
public class Anagram {

	public void checkAnagram(String str1, String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int n1 = str1.length();
		int n2 = str2.length();
		if(n1!=n2)
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true)
			{
				System.out.println("Anagram String");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String str1 = s.nextLine();
		System.out.println("Enter the 2nd String: ");
		String str2 = s.nextLine();
		Anagram obj = new Anagram();
		obj.checkAnagram(str1, str2);

	}

}
