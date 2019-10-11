package chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TestDogsPredicate
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String[] args)
	{
		List<Dog> dogs = new ArrayList<>();

		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		Dog aiko = new Dog("aiko", 50, 10);
		Dog zooey = new Dog("zooey", 45, 8);
		Dog charis = new Dog("charis", 120, 7);

		dogs.add(boi);
		dogs.add(clover);
		dogs.add(aiko);
		dogs.add(zooey);
		dogs.add(charis);

		System.out.println("All dogs ---");
		dogs.forEach(d -> System.out.println(d));

		System.out.println("Dogs younger than 9 ----");
		printDogIf(dogs, d -> d.getAge() < 9);

		System.out.println("Dogs 9 or older ----");
		printDogIf(dogs, d -> d.getAge() >= 9);

		Predicate<Dog> findCs = d -> d.getName().startsWith("c");
		dogs.removeIf(findCs);
		System.out.println("Dogs without C ---");
		dogs.forEach(d -> System.out.println(d));

		Predicate<Dog> age = d -> d.getAge() == 6;
		System.out.println("Is boi NOT 6? " + age.negate().test(boi));

		Predicate<Dog> name = d -> d.getName().equals("boi");
		System.out.println("Is boi named 'boi' and age 6? " + age.and(name).test(boi));
		boi.setAge(7);
		System.out.println("Is boi named 'boi' and age 6? " + age.and(name).test(boi));

		Predicate<Dog> ageAndName = age.and(name);
		System.out.println("Is boi named 'boi' and age 6? " + ageAndName.test(boi));

		Predicate<Dog> isEqual = Predicate.isEqual(zooey);
		System.out.println("Is aiko the same as zooey: " + isEqual.test(aiko));
		System.out.println("Is zooey the same as zooey: " + isEqual.test(zooey));
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param  dogs
	 * @param  p
	 */
	public static void printDogIf(List<Dog> dogs, Predicate<Dog> p)
	{
		for (Dog d : dogs)
		{
			if (p.test(d))
			{
				System.out.println(d);
			}
		}
	}
}
