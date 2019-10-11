package chapter8;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@FunctionalInterface
public interface DogQuerier
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   d
	 * @return
	 */
	public boolean test(Dog d);
	
	/** DOCUMENT ME! */
	default public void testDefaultMethod()
	{
		;
	}
	

	/** DOCUMENT ME! */
	public static void testStaticMethod() { }
}
