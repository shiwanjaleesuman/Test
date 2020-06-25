/**
 * 
 */
package internal.date_26_11.stringhandling.comparision.comparable;
//A comparable object is capable of comparing itself with another object. The class itself must implements the java.lang.Comparable interface to compare its instances.
//Consider a Movie class that has members like, rating, name, year. Suppose we wish to sort a list of Movies based on year of release. We can implement the Comparable interface with the Movie class, and we override the method compareTo() of Comparable interface. 
// It is internal implementaion in a class as the 2 members are comapared within a class itself.

/**
 * @author Shiwanjalee
 *
 */
/**
 * Sorting movies on the basis of year of release
 *
 */
public class Movie implements Comparable<Movie>
{
	public String name;
	public double rating;
	public int year;
	
	/* 
	 * Used to sort the movies by year
	 */
	@Override
	public int compareTo(Movie m) 
	{
		return this.year - m.year;
	}
	
	public Movie(String n, double rt, int yr)
	{
		name = n;
		rating = rt;
		year = yr;
	}
	
	/**
	 * Used to return movie name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Used to return movie rating
	 */
	public double getRating()
	{
		return rating;
	}
	
	/**
	 * Used to return release year of the movie
	 */
	public int getYear()
	{
		return year;
	}
}
