package chapter2;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TShirt extends Clothing
{
	//~ Constructors -----------------------------
	/** Creates a new TShirt object. */
	public TShirt( )
	{
		this("Hello");
	}

	/**
	 * Creates a new TShirt object.
	 *
	 * @param  s
	 */
	public TShirt(String s)
	{
		// this( );
		super(s);
	}
}
