/**
 * 
 */
package internal.date_30;

import java.util.Scanner;

/**
 * @author ssuman
 *
 */

public class Reverse_No {
	static int temp;
	static int rem;
	static int reverse=0;
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int num = input.nextInt();
		temp = num;
		while(num>0)
		{
			rem = num%10;
			reverse = reverse*10+rem;
			num = num/10;
		}
		System.out.println("Reversed Number:"+reverse);
		
	}

}
