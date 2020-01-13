package com.cts.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		FileSystem fs=FileSystems.getDefault();
		//Path path=fs.getPath("C:\\Users\\Dell\\Desktop");
		//Path path=fs.getPath("C:", "Users","Dell","Desktop");
		Path path=Paths.get("C:", "Users","Dell","Desktop","Demo");
		
		Path path2=Paths.get("C:", "Users","Dell","Desktop","Demo3");
		
//		System.out.println("Name Count: "+path.getNameCount());
//		System.out.println("Is Absolute: "+path.isAbsolute());
//		System.out.println("Name on Index 2: "+path.getName(0));
		

		
//		Files.createFile(path);
		
//		Files.createDirectory(path);
		
//		Files.delete(path);
		
//		Files.createDirectories(path);
	
//		System.out.println(Files.exists(path));
		
//		System.out.println(Files.notExists(path));
		
//		Files.copy(path, path2);
		
//		Files.move(path, path2);
		
		
		
		
		
	}

}
