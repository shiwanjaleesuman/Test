/**
 * 
 */
package internal.date_30;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author OneStop
 *
 */
public class Armstrong_Number {
	static int temp;
	static int rem;
	static int result=0;
	
	public static void main(String args[]) {
		int count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the desired number:");
		int num = input.nextInt();
		temp = num;
		while(num>0)
		{
			num=num/10;
			count+=1;
		}
		
		num=temp;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			result=(int) (result+(Math.pow(rem, count)));
			System.out.println(result);
		}
		if(temp==result)
		{
			System.out.println("Armstrong number: "+result);
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
	}
}
