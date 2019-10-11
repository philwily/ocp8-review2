package chapter1.food;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Foo
{
	//~ Instance fields --------------------------
	/**  */
	private int size = 29;
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param  size
	 */
	public void setSize(int size)
	{
		size = size;
		System.out.println(size);
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		Foo foo = new Foo();
		foo.setSize(35);
	}
}
