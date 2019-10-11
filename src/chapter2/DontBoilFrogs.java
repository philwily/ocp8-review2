package chapter2;
import static chapter2.FrogBoilable.getCToF;

public class DontBoilFrogs implements FrogBoilable
{
	public static void main(String[] args)
	{
		new DontBoilFrogs().go();
		testStatic("From static method");
	}
	
	public static void testStatic(String s)
	{
		System.out.println("test static: " + s);
	}
	
	public void go()
	{
		System.out.println(hop());
		System.out.println(getCToF(100)); // will work with static import
		System.out.println(FrogBoilable.getCToF(200));
		
		DontBoilFrogs dbf = new DontBoilFrogs();
		//dbf.getCToF(300);
		dbf.testStatic("From reference variable " );
		DontBoilFrogs.testStatic("From instance method");
		// for static interface methods - can't use instance vs static class methods which can use instance/class references
	}
}