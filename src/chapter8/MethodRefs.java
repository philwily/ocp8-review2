package chapter8;

import java.util.Arrays;
import java.util.List;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class MethodRefs
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		List<String> trees = Arrays.asList("fir", "cedar", "prime");
		trees.forEach(tree -> System.out.println(tree));

		trees.forEach(System.out::println);

		trees.forEach(MethodRefs::printTree);
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  treeName
	 */
	private static void printTree(String treeName)
	{
		System.out.println("Tree Name: " + treeName);
	}
}
