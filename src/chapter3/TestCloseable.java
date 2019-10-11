package chapter3;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TestCloseable
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param   args
	 * @throws  Exception
	 */
	public static void main(String[] args) throws Exception
	{
		try(Good good = new Good();
			Bad bad = new Bad())
		{
			throw new Exception("Try Exception");
		}
	}
	//~ Inner Classes ----------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @version  $Revision$, $Date$
	 */
	static class Bad implements AutoCloseable
	{
		/** @see  java.lang.AutoCloseable#close() */
		@Override
		public void close() throws Exception
		{
			System.out.println("Bad");
			throw new Exception("Bad exception");
		}
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @version  $Revision$, $Date$
	 */
	static class Good implements AutoCloseable
	{
		/** @see  java.lang.AutoCloseable#close() */
		@Override
		public void close()
		{
			System.out.println("Good");
		}
	}
}
