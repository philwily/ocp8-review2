package chapter8;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TestTriPredicate
{
	//~ Methods ----------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		TriPredicate<String, Integer, Integer> testTri = (s, i1, i2) ->
		{
			if (s.equals("There is no spoon") && (i1 > 2) && (i2 < i1))
			{
				return true;
			}
			else
			{
				return false;
			}
		};

		System.out.println("Pass the test? " + testTri.test("Follow the white rabbit", 2, 3));
		System.out.println("Pass the test? " + testTri.test("There is no spoon", 101, 3));
	}
}
