package chapter5;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Writer2
{
	public static void main(String[] args)
	{
		char[] in = new char[50];
		int size = 0;
		try
		{
			File file = new File("src\\chapter5\\filewrite2.txt");//new File("chapter5\\filewrite2.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("howdy\nworld\n");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println("Size: " + size);
			for (char c : in)
			{
				System.out.print(c);
			}
			fr.close();
			
			// clean-up
			file.deleteOnExit();
		}
		catch (IOException ie)
		{
			ie.printStackTrace();
		}
	}

}