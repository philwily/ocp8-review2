package chapter2;

public class Init
{
	static int[] x = new int[4];
	int[] y = new int[4];
	
	Init(int x)
	{
		System.out.println("1 arg const");
	}
	
	Init()
	{
		System.out.println("no arg const");
	}
	
	static
	{
		//x[4] = 1;
		System.out.println("1st static init");
	}
	
	{
		//y[4] = 1;
		System.out.println("1st instance init");
	}
	
	{
		System.out.println("2nd instance init");
	}
	
	static
	{
		System.out.println("2nd static init");
	}
	
	public static void main(String[] args)
	{
		new Init();
		new Init(7);
	}
}