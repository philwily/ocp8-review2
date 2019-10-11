package chapter2;

public class StaticRedefinitionTest
{
	public static void main(String[] args)
	{
		Animal[] animals = { new Animal(), new Dog(), new Animal()};
		for (Animal animal : animals)
		{
			animal.doStuff();
		}
		Dog.doStuff();
		
		//animal, animal, animal, dog
		// notice than even if 2nd instance is dog, because the reference is animal, calls the static animal
		
		
	}
}

class Animal
{
	static void doStuff()
	{
		System.out.print("animal ");
	}
}

class Dog extends Animal
{
	static void doStuff()
	{
		System.out.print("Dog ");
	}
}