package chapter2;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class MultiInt implements I1, I2
{
	//~ Methods ----------------------------------
	/** @see  chapter2.I1#doStuff() */
	public int doStuff()
	{
		return I2.super.doStuff();
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		System.out.println(new MultiInt().doStuff());
	}
}
