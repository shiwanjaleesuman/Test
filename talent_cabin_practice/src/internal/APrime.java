package internal;

import java.util.Scanner;

public class APrime {

static int factor=0;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		PrimeNo obj = new PrimeNo();
		obj.checkPrimeNumber(n);
	}
	
	public void checkPrimeNumber(int n)
	{
		for(int i=1; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				factor+=1;
			}
		}
		if(factor == 2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}


}
