package chapter8;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class Dog
{
	//~ Instance fields --------------------------
	/**  */
	private int age = 0;

	/**  */
	private String name;

	/**  */
	private int weight;
	//~ Constructors -----------------------------
	/**
	 * Creates a new Dog object.
	 *
	 * @param  age
	 */
	public Dog(String name, int weight, int age)
	{
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public int getWeight()
	{
		return weight;
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	public int getAge()
	{
		return age;
	}
	

	/**
	 * DOCUMENT ME!
	 *
	 * @param  age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/** DOCUMENT ME! */
	public void bark()
	{
		System.out.println("woof");
	}
	
	/** @see  java.lang.Object#toString() */
	@Override
	public String toString()
	{
		return name + " is " + age + " years old and weighs " + weight + " pounds";
	}
}
