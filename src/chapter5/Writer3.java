package chapter5;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Writer3
{
	public static void main(String[] args)
	{
		byte[] in = new byte[50];
		int size = 0;
		try
		{
			boolean newFile = false;
			File file = new File("chapter5\\filewrite3.txt");
			FileOutputStream fos = new FileOutputStream(file);
			String s = "howdy\nworld\n";
			fos.write(s.getBytes("UTF-8"));
			fos.flush();
			fos.close();
			
			FileInputStream fis = new FileInputStream(file);
			size = fis.read(in);
			System.out.println("Size: " + size);
			for (byte b : in)
			{
				System.out.print((char)b);
			}
			fis.close();
		}
		catch (IOException ie)
		{
			ie.printStackTrace();
		}
	}

}