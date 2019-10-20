package chapter5;

import java.io.IOException;
import java.io.File;

public class Writer1
{
	public static void main(String[] args)
	{
		try
		{
			boolean newFile = false;
			File file = new File("src\\chapter5\\filewrite1.txt");//new File("chapter5\\filewrite1.txt");
			System.out.println("File exists: " + file.exists());
		
			newFile = file.createNewFile();
			System.out.println("File created: " + newFile);
			System.out.println("File exists: " + file.exists());
			
			// clean-up
			newFile = file.delete();
			System.out.println("File deleted: " + newFile);
			System.out.println("File exists: " + file.exists());			
		}
		catch (IOException ie)
		{
			ie.printStackTrace();
		}
	}

}