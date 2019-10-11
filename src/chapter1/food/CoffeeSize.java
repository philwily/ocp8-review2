package chapter1.food;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public enum CoffeeSize
{
	//~ Enum constants ---------------------------
	BIG(8), HUGE(10), OVERWHELMING(16)
	{
		public String getLidCode()
		{
			return "A";
		}
	};
	//~ Instance fields --------------------------
	/** all allowed */
	private int ounces = 0;
	//~ Constructors -----------------------------
	/**
	 * only private and package private
	 *
	 * @param  ounces
	 */
	private CoffeeSize(int ounces)
	{
		this.ounces = ounces;
	}
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getLidCode()
	{
		return "B";
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public int getOunces()
	{
		return ounces;
	}
}
