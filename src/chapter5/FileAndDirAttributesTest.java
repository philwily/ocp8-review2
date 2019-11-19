package chapter5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FileAndDirAttributesTest {

	public static void main(String[] args) 
	{
		LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 1);
		LocalTime localTime = LocalTime.of(10, 0);
		ZonedDateTime jan1stZDT = ZonedDateTime.of(localDate, localTime, ZoneId.of("US/Pacific"));
		Instant jan1st = jan1stZDT.toInstant();
		
		Path file = Paths.get("src\\chapter5\\filewrite1.txt");
		boolean exists = Files.exists(file);
		System.out.println("File exists: " + exists);
		try 
		{
			if (!exists)
			{
				Files.createFile(file);
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
		exists = Files.exists(file);
		System.out.println("File exists: " + exists);
		
		try
		{
			System.out.println("Last Modified Time: " + Files.getLastModifiedTime(file));

			FileTime fileTime = FileTime.fromMillis(jan1st.getEpochSecond()*1000);
			Files.setLastModifiedTime(file, fileTime);
			
			System.out.println("Last Modified Time: " + Files.getLastModifiedTime(file));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
			
		System.out.println("Is Executable: " + Files.isExecutable(file));
		System.out.println("Is Readable: " + Files.isReadable(file));
		System.out.println("Is Writable: " + Files.isWritable(file));

		try
		{
			// io
			BasicFileAttributes basic = Files.readAttributes(file, BasicFileAttributes.class);	
			
			FileTime lastModifiedTime = basic.lastModifiedTime();
			FileTime creationTime = basic.creationTime();
			FileTime lastAccessTime = basic.lastAccessTime();
			System.out.println("Creation Time: " + creationTime);
			System.out.println("Last Modified Time: " + lastModifiedTime);
			System.out.println("Last Access Time: " + lastAccessTime);
			
			// modify
			FileTime now = FileTime.fromMillis(System.currentTimeMillis());
			BasicFileAttributeView view = Files.getFileAttributeView(file, BasicFileAttributeView.class);
			//io
			view.setTimes(lastModifiedTime, now, creationTime);
			
			System.out.println("Creation Time: " + creationTime);
			System.out.println("Last Modified Time: " + lastModifiedTime);
			System.out.println("Last Access Time: " + lastAccessTime);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//cleanup
		try
		{
			Files.delete(file);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
		
		
	}

}
