package internal.date_30;

import java.util.Scanner;

public class Palindrome {
	static int temp;
	static int rem;
	static int result=0;
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the desired number:");
		int num = input.nextInt();
		temp = num;
		while(num>0)
		{
			rem = num%10; 
			result = result*10+rem;
			num = num/10;
		}
		if(temp==result)
		{
			System.out.println("Palindrome Number:"+result);
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
		//
	}

}
