package chapter1.food;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Fruit3
{
	//~ Constructors -----------------------------
	/** Creates a new Fruit3 object. */
	public Fruit3( )
	{
		Fruit2 fruit2 = new Fruit2();
		fruit2.x = 5;
		fruit2.y = 6;

		System.out.println(fruit2.x);
		System.out.println(fruit2.y);
	}
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		new Fruit3();
		new Fruit6();
	}
}

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
class Fruit6 extends Fruit2
{
	//~ Constructors -----------------------------
	/** Creates a new Fruit6 object. */
	public Fruit6( )
	{
		// package only
		x = 7;
		// package + kids
		y = 8;

		System.out.println(x);
		System.out.println(y);

		Fruit2 fruit2 = new Fruit2();
		fruit2.x = 9;
		fruit2.y = 10;

		System.out.println(fruit2.x);
		System.out.println(fruit2.y);
	}
}
