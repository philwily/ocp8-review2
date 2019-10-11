package chapter8;

import java.util.Map;
import java.util.TreeMap;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Functions
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		Map<String, String> aprilWinner = new TreeMap<>();
		aprilWinner.put("April 2017", "Bob");
		aprilWinner.put("April 2016", "Annette");
		aprilWinner.put("April 2015", "Lamar");

		System.out.println("List before checking 2014");
		aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));

		// add if absent
		aprilWinner.computeIfAbsent("April 2014", k -> "John Doe");

		System.out.println("List after checking 2014");
		aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));

		// if present?
		aprilWinner.computeIfAbsent("April 2014", k -> "Jane Doe");
		System.out.println("List after checking 2014");
		aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));

		aprilWinner.replaceAll((k, v) -> v.toUpperCase());
		System.out.println("After upper case");
		aprilWinner.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
