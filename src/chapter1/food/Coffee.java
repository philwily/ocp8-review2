package chapter1.food;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Coffee
{
	//~ Instance fields --------------------------
	/**  */
	private CoffeeSize coffeeSize;
	//~ Constructors -----------------------------

	/**
	 * Creates a new Coffee object.
	 *
	 * @param  coffeeSize
	 */
	public Coffee(CoffeeSize coffeeSize)
	{
		this.coffeeSize = coffeeSize;
	}
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		Coffee coffee1 = new Coffee(CoffeeSize.BIG);
		System.out.println(coffee1.coffeeSize.getOunces());
	}
}
