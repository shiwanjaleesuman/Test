/**
 * 
 */
package internal.date_26_11.stringhandling.comparision.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Shiwanjalee
 *
 */
public class MovieTest {

	/**
	 * To execute and display the list of sorted movies.
	 */
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Baby Boss", 4, 2005));
		list.add(new Movie("Incredibles", 3.5, 2007));
		list.add(new Movie("Inside Out", 4.5, 2012));
		list.add(new Movie("Ice Age", 5, 2000));
		
		Collections.sort(list);
		
		System.out.println("List of movies after sorting on the basis of year of release...");
		
		for(Movie mov: list)
		{
			System.out.println("Movie Name : "+mov.getName()+" Movie Rating : "+mov.getRating()+" Movie Year of release : "+mov.getYear());
		}
	}
}
