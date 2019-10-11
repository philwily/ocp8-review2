package chapter2.zoo;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class UseAnimals
{
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param  a
	 */
	public void doStuff(Animal a)
	{
		System.out.println("Animal");
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  h
	 */
	public void doStuff(Horse h)
	{
		System.out.println("Horse");
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		Animal a = new Animal();
		Animal b = new Horse();
		Horse c = (Horse) b;

		// overridden - determined at runtime based on object type
		// overloaded - determined at compile time on reference type
		UseAnimals ua = new UseAnimals();
		ua.doStuff(a);
		ua.doStuff(b);
		ua.doStuff(c);
	}
}
