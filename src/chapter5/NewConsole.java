package chapter5;

import java.io.Console;
public class NewConsole 
{
	public static void main(String[] args)
	{
		String name = "";
		Console c = System.console();
		char[] pw = null;
		pw = c.readPassword("%s", "Password: ");
		c.format("Password: ");
		for (char ch : pw)
		{
			c.format("%c ",ch);
		}
		c.format("\n");
		
		MyUtility mu = new MyUtility();
		while (true)
		{
			name = c.readLine("Input: ");
			c.format("Output: %s\n", mu.doStuff(name));
		}
		
	}
}

class MyUtility
{
	String doStuff(String arg1)
	{
		return "Result: " + arg1;
	}
}
