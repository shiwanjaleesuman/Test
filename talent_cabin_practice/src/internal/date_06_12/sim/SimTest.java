/**
 * 
 */
package internal.date_06_12.sim;

import java.util.Scanner;

/**
 * @author Shiwanjalee
 *
 */
public class SimTest {

	/**
	 * Sim operator details
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operator:\n 1. Airtel \n 2. Vodafone \n 3. Jio");
		int x = s.nextInt();
		switch(x)
		{
		case 1 : Airtel air = new Airtel();
		System.out.println("calling charges:"+air.call()+"paise/min");
		System.out.println("message charges:"+air.msg()+"Rs/msg");
		System.out.println("date charges:"+air.data()+"Rs/GB");
		break;
		
		case 2 : Vodafone voda = new Vodafone();
		System.out.println("calling charges:"+voda.call()+"paise/min");
		System.out.println("message charges:"+voda.msg()+"Rs/msg");
		System.out.println("date charges:"+voda.data()+"Rs/GB");
		break;
		
		case 3 : Jio jio = new Jio();
		System.out.println("calling charges:"+jio.call()+"paise/min");
		System.out.println("message charges:"+jio.msg()+"Rs/msg");
		System.out.println("date charges:"+jio.data()+"Rs/GB");
		break;
		}
	}
}
