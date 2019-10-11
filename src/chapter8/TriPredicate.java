package chapter8;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@FunctionalInterface
public interface TriPredicate<T, U, V>
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   t
	 * @param   u
	 * @param   v
	 * @return
	 */
	boolean test(T t, U u, V v);
}
