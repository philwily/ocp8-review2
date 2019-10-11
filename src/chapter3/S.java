package chapter3;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class S
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		try
		{
			method();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getSuppressed()[0]);
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @throws  Exception
	 */
	private static void method() throws Exception
	{
		try(A a = new A())
		{
			throw new Exception("try");
		}
		// finally
		// {
		// throw new Exception("finally");
		// }
	}
	//~ Inner Classes ----------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @version  $Revision$, $Date$
	 */
	static class A implements AutoCloseable
	{
		/** @see  java.lang.AutoCloseable#close() */
		@Override
		public void close() throws Exception
		{
			throw new Exception("catch");
		}
	}
}
