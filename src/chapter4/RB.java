package chapter4;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class RB
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		System.out.println(Locale.getDefault());
		Locale myLocale = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("chapter4.myProps", myLocale);
		// ResourceBundle rb = ResourceBundle.getBundle("myProps", myLocale);
		System.out.println(rb.getString("k2"));
		System.out.println(rb.getLocale());
	}
}
