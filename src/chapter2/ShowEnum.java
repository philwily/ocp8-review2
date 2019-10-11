package chapter2;

import java.util.HashSet;
import java.util.Set;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public enum ShowEnum
{
	//~ Enum constants ---------------------------
	INSTANCE;
	//~ Instance fields --------------------------

	/**  */
	private Set<String> availableSeats;
	//~ Constructors -----------------------------

	/** Creates a new ShowEnum object. */
	private ShowEnum( )
	{
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param   seat
	 * @return
	 */
	public boolean bookSeat(String seat)
	{
		return availableSeats.remove(seat);
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		agentBookSeat("1A");
		agentBookSeat("1A");
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  seat
	 */
	private static void agentBookSeat(String seat)
	{
		System.out.println("Booked " + seat + ": " + ShowEnum.INSTANCE.bookSeat(seat));
	}
}
