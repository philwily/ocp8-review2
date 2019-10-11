package chapter2;

public interface FrogBoilable
{
	static int getCToF(int cTemp)
	{
		return (cTemp * 9/5) + 32;
	}
	
	default String hop()
	{
		return "hopping";
	}
}