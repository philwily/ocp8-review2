package chapter2.zoo;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TestAnimals
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		Animal a = new Animal();
		Animal b = new Horse();

		// downcast requires explicit cast
		// allowed but recommended to use instanceof to verify
		Horse c = (Horse) b;
		// compile error: incompatible types
		// without explicit cast
		// Horse d = b;
		// different tree
		// String s = (String) b;

		// upcast doesn;t require explicit cast
		Animal e = c;
		Animal f = (Animal) c;

		a.eat();
		b.eat();
	}
}
