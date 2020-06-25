/**
 * 
 */
package internal.ap_example;

/**
 * @author OneStop
 *
 */
public class BundleDiscountPercentage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String tBundleListPrice = "30";
		String tBundleSalePrice = "20";
		
		if(tBundleListPrice !=null && tBundleSalePrice != null)
		{
		    Double  tDiscountedBundlePrice = (Double.parseDouble(tBundleListPrice)-Double.parseDouble(tBundleSalePrice))/Double.parseDouble(tBundleListPrice);
			Double discountResult = (tDiscountedBundlePrice*100);	
			System.out.println(discountResult);
		}
		else
		{
			System.out.print("Error");
		}
		
	}

}
