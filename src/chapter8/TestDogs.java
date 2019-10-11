package chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
public class TestDogs
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @param  args
	 */
	public static void main(String... args)
	{
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);

		DogQuerier dq = (d) -> d.getAge() > 9;

		System.out.println("Is Boi older than 9?: " + dq.test(boi));
		System.out.println("Is Clover older than 9?: " + dq.test(clover));

		DogsPlay dp = new DogsPlay(d -> d.getAge() > 9);
		System.out.println("Is Boi older than 9?: " + dp.doQuery(boi));
		System.out.println("Is Clover older than 9?: " + dp.doQuery(clover));

		int numCats = 3;
		DogQuerier dq2 = d ->
		{
			int numBalls = 1;
			numBalls++;
			System.out.println("numCats: " + numCats);

			// numCats++;;
			return d.getAge() > 9;
		};

		// numCats++;

		dq2.test(boi);
		dp = new DogsPlay(dq2);
		dp.doQuery(boi);

		Dog zooey = new Dog("zooey", 18, 10);
		List<Dog> dogs = new ArrayList<>();
		dogs.add(boi);
		dogs.add(clover);
		dogs.add(zooey);

		Consumer<Dog> printName = d -> System.out.print(d.getName() + " ");
		Consumer<Dog> bark = d -> d.bark();

		dogs.forEach(printName.andThen(bark));
		// compile error
		// dogs.forEach((d -> System.out.print(d.getName() + " ")).andThen(bark));
		dogs.forEach(printName.andThen(d -> d.bark()));

		Predicate<Dog> pred = d -> d.getAge() > 9;
		System.out.println("Is Boi older than 9?: " + pred.test(boi));
		System.out.println("Is Clover older than 9?: " + pred.test(clover));
	}
}
