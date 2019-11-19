package chapter5;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioTest {

	public static void main(String[] args) throws IOException 
	{
		Path p1 = Paths.get("src", "Chapter5", "tmp.txt");
		Path p1b = FileSystems.getDefault().getPath("src", "Chapter5", "tmp.txt");
		System.out.println("Path 1: " + p1);
		System.out.println("Path 1b: " + p1b);
		System.out.println(p1.equals(p1b)); 
		URI uri = p1.toUri();
		Path p2 = Paths.get(uri); 	
		System.out.println("Path 2: " + p2);
		System.out.println("Relative and Absolute are equals? " + p1.equals(p2)); // relative vs absolute
		
		System.out.println("Exists P1: Expected: False. Actual: " + Files.exists(p1));
		// default, symbolic links are followed
		if (Files.notExists(p1, LinkOption.NOFOLLOW_LINKS))
		{
			Files.createFile(p1);
		}
		System.out.println("Exists P1: Expected: True. Actual: " + Files.exists(p1));
		
		
		Path dir1 = Paths.get("src", "Chapter5", "tmpDir");
		Files.createDirectories(dir1); //createDirectory
		
		// move/copy
		// no Paths.get(path, ...);
		Path p3 = Paths.get("src", "Chapter5", "tmpDir", "tmp.txt");
		Files.copy(p1, p3, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Exists P1: Expected: True. Actual: " + Files.exists(p1));
		Files.move(p1, p3, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Exists P1: Expected: False. Actual: " + Files.exists(p1));
		System.out.println("Exists P3: Expected: True. Actual: " + Files.exists(p3));
		
		// Retrieving information about path
		// File doesn't have to exist
		System.out.println("Relative Path: " + p3);	
		System.out.println("getFileName(): " + p3.getFileName());
		int nameCount = p3.getNameCount();
		System.out.println("getNameCount(): " + nameCount);
		for (int i = 0; i < nameCount; i++)
		{
			System.out.println("getName(" + i + "): " + p3.getName(i));
		}
		System.out.println("getRoot(): " + p3.getRoot());
		System.out.println("subpath(0,2): " + p3.subpath(0,2));
		
		
		uri = p3.toUri();
		p2 = Paths.get(uri); 
		System.out.println();
		System.out.println("Absolute Path: " + p2);	
		System.out.println("getFileName(): " + p2.getFileName());
		nameCount = p2.getNameCount();
		System.out.println("getNameCount(): " + nameCount);
		for (int i = 0; i < nameCount; i++)
		{
			System.out.println("getName(" + i + "): " + p2.getName(i));
		}
		System.out.println("getRoot(): " + p2.getRoot());
		System.out.println("subpath(0,2): " + p2.subpath(0,2));
		
		// Iterate, directory tree format
		int spaces = 2;
		System.out.println(p2.getRoot());
		for (Path subPath: p2)
		{
			System.out.format("%" + spaces + "s%s%n", "-", subPath);
			spaces +=2;
		}
		
		// cleanup
		// alternative - no exception if not existing
		// Files.deleteIfExisting
		Files.delete(p3);
		Files.delete(dir1);
		
		// Normalizing Paths
		String buildProject = "BuildProject/scripts";
		String upTwoDirectories = "../..";
		
		String myProject = "MyProject/Source";
		Path p4 = Paths.get(buildProject, upTwoDirectories, myProject);
		
		System.out.println("Original: " + p4);
		System.out.println("Normalized: " + p4.normalize());
		
		// Resolving Paths - combining two paths
		Path absolute = Paths.get("/home/java");
		Path relative = Paths.get("dir");
		Path file = Paths.get("Model.pdf");
		String nullStr = null;
		
		System.out.println();
		System.out.println("1: " + absolute.resolve(relative)); // OK = /home/java/dir
		System.out.println("2: " + absolute.resolve(file)); // OK = /home/java/Model.pdf
		System.out.println("3: " + relative.resolve(file)); // OK = dir/Model.pdf
		System.out.println("4: " + relative.resolve(absolute)); // NOT OK, returns absolute
		System.out.println("5: " + file.resolve(absolute)); // NOT OK, returns absolute
		System.out.println("6: " + file.resolve(relative)); // NOT OK, but java not sure so does it
		//System.out.println("7: " + absolute.resolve(null)); // does not compile, as java not sure which method to call
		
		try
		{
			System.out.println("7a: " + absolute.resolve((String)null)); // OK. Compiles, but NPE
		}
		catch (NullPointerException npe)
		{
			System.out.println("7a: NPE");
		}
		
		try
		{
			System.out.println("7b: " + absolute.resolve(nullStr)); // OK. Compiles, but NPE
		}
		catch (NullPointerException npe)
		{
			System.out.println("7b: NPE");
		}
		
		try
		{
			System.out.println("7c: " + absolute.resolve((Path)null)); // OK. Compiles, but NPE
		}
		catch (NullPointerException npe)
		{
			System.out.println("7c: NPE");
		}
		
		// Relativize - how to get from one directory to parameter dir
		Path absolute1 = Paths.get("/home/java");
		Path absolute2 = Paths.get("/usr/local");
		Path absolute3 = Paths.get("/home/java/tmp/music.mp3");
		Path relative1 = Paths.get("tmp");
		Path relative2 = Paths.get("tmp/music.pdf");
		
		System.out.println();
		System.out.println("1: " + absolute1.relativize(absolute3)); // tmp/music.mp3
		System.out.println("2: " + absolute3.relativize(absolute1)); // ../..
		System.out.println("3: " + absolute1.relativize(absolute2)); // ../../usr/local
		System.out.println("4: " + relative1.relativize(relative2)); // music.pdf
		// absolute to absolute, relative to relative
		//System.out.println("5: " + absolute1.relativize(relative1)); // BAD, java has no idea
		//System.out.println("6: " + absolute3.relativize(relative1)); // still BAD
		
		
	}

}
