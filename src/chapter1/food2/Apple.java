package chapter1.food2;

import chapter1.food.Fruit;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
class Apple extends Fruit { }

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
enum Animals
{
	//~ Enum constants ---------------------------
	CAT("meow"), DOG("woof"), FISH("burble");
	//~ Instance fields --------------------------
	/**  */
	private String sound;
	//~ Constructors -----------------------------
	/**
	 * only private and default
	 *
	 * @param  sound
	 */
	private Animals(String sound)
	{
		this.sound = sound;
	}
}
