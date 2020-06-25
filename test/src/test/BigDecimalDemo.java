package test;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		//String inp1 = "16.99";
		//String inp2 = "9.777";
		int inp3 = 1;
		
		BigDecimal bd1 = new BigDecimal("16.99");
		BigDecimal bd2 = new BigDecimal("9.777");
		BigDecimal bd3 = bd1.subtract(bd2);
		BigDecimal bd4 = bd3.divide(BigDecimal.valueOf(inp3));
		
		Double dob1 = (bd4.doubleValue()*100)/bd1.doubleValue();
		System.out.println(bd3);
		System.out.println(bd3.doubleValue());
		System.out.println(bd1.doubleValue()-bd2.doubleValue());
		System.out.println(bd4.doubleValue());
		System.out.println(dob1);
		
		String l = "123";
		System.out.println(l);
		System.out.println("l");
		
			
	}

}
