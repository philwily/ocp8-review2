package chapter2;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public final class ADSR
{
	//~ Instance fields --------------------------
	/**  */
	private final int attack;

	/**  */
	private final int decay;

	/** if final, can't set initial values */
	private final StringBuilder name;
	//~ Constructors -----------------------------

	/**
	 * Creates a new ADSR object.
	 *
	 * @param  name
	 * @param  attack
	 * @param  decay
	 */
	public ADSR(StringBuilder name, int attack, int decay)
	{
		this.name = new StringBuilder(name);
		this.attack = attack;
		this.decay = decay;
	}
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public StringBuilder getName()
	{
		StringBuilder nameCopy = new StringBuilder(name);
		if (nameCopy != name)
		{
			System.out.println("Different objects");
		}

		return nameCopy;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public ADSR getADSR()
	{
		return this;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("a1");
		ADSR a1 = new ADSR(sb, 5, 7);
		ADSR a2 = a1.getADSR();
		System.out.println("a1: " + a1.getName());
		System.out.println("a2: " + a2.getName());
		sb.append(" alter the name");
		StringBuilder sb1 = a1.getName().append(" alter the name for a3");
		ADSR a3 = new ADSR(sb1, 5, 7);
		System.out.println("a1: " + a1.getName());
		System.out.println("a2: " + a2.getName());
		System.out.println("a3: " + a3.getName());
	}
}
