package chapter1;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Mini2 extends Car2
{
	//~ Static fields/initializers ---------------
	/**  */
	static int i1 = 7;
	//~ Instance fields --------------------------
	/**  */
	int i2 = 8;
	//~ Methods ----------------------------------
	/** DOCUMENT ME! */
	public static void m1()
	{
		System.out.print(i1);
	}
	
	/** @see  chapter1.Car2#m2() */
	// public void m2()
	// {
	// System.out.print(i2);
	// }

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		Car2 c = new Mini2();
		c.m1();
		System.out.print(" ");
		c.m2();
		System.out.println(" " + c.i1 + c.i2);
	}
}

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
class Car2
{
	//~ Static fields/initializers ---------------
	/**  */
	static int i1 = 5;
	//~ Instance fields --------------------------
	/**  */
	int i2 = 6;
	//~ Methods ----------------------------------
	/** DOCUMENT ME! */
	public static void m1()
	{
		System.out.print(i1);
	}
	
	/** DOCUMENT ME! */
	public void m2()
	{
		System.out.print(i2);
	}
}
