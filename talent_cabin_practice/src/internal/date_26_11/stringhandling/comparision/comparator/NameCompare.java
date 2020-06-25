/**
 * 
 */
package internal.date_26_11.stringhandling.comparision.comparator;

import java.util.Comparator;

/**
 * @author OneStop
 *
 */
public class NameCompare implements Comparator<Movie>
{
	@Override
	public int compare(Movie m1, Movie m2) 
	{
			return m1.getName().compareTo(m2.getName());
	}
}
