package chapter8;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class DogsPlay
{
	//~ Instance fields --------------------------
	/**  */
	private DogQuerier dq;
	//~ Constructors -----------------------------
	/**
	 * Creates a new DogsPlay object.
	 *
	 * @param  dq
	 */
	public DogsPlay(DogQuerier dq)
	{
		this.dq = dq;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   d
	 * @return
	 */
	public boolean doQuery(Dog d)
	{
		return dq.test(d);
	}
}
