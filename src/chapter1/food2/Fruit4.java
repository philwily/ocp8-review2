package chapter1.food2;

import chapter1.food.Fruit2;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Fruit4
{
	//~ Constructors -----------------------------
	/** Creates a new Fruit4 object. */
	public Fruit4( )
	{
		// not visible because package only
		// new Fruit2().x = 5;
	}
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		new Fruit5();
	}
}

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
class Fruit5 extends Fruit2
{
	//~ Constructors -----------------------------
	/** Creates a new Fruit5 object. */
	public Fruit5( )
	{
		// package only
		// x = 7;
		// package + kids
		y = 8;

		// System.out.println(x);
		System.out.println(y);

		// no access as only by inheritance since different package
		// Fruit2 fruit2 = new Fruit2();
		// fruit2.x = 5;
		// fruit2.y = 6;

		// System.out.println(fruit2.x);
		// System.out.println(fruit2.y);
	}
}
